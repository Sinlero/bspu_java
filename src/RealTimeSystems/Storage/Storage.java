package RealTimeSystems.Storage;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Storage {

    private final int CAPACITY;
    private Map<String, Integer> products;
    private int currentCapacity;

    public Storage(Map<String, Integer> initProducts) {
        this(initProducts, 10_000);
    }

    public Storage(Map<String, Integer> initProducts, int maxCapacity) {
        this.products = new ConcurrentHashMap<>(initProducts);
        this.CAPACITY = maxCapacity;
        this.currentCapacity = initProducts.values().stream().reduce(Math::addExact).orElse(0);
        if (currentCapacity > CAPACITY) {
            System.out.println("Overflow");
            System.exit(1);
        }
    }

    public synchronized void getProducts(Map<String, Integer> requestedProducts) {
        int capacityRequested = requestedProducts.values().stream().reduce(Math::addExact).get();
        while (capacityRequested > currentCapacity) {
            try {
                System.out.println("Склад пустой, жду поставки");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Map.Entry<String, Integer> entry : requestedProducts.entrySet()) {
            if (products.get(entry.getKey()) != null) {
                int countProducts = products.get(entry.getKey()) - entry.getValue();
                products.replace(entry.getKey(), countProducts);
            }
        }
        this.currentCapacity = this.currentCapacity - capacityRequested;
        System.out.println(Thread.currentThread().getName());
        publishSmeta();
        notify();
    }

    public synchronized void setProducts(Map<String, Integer> producedProducts) {
        Optional<Integer> produceCapacity = producedProducts.values().stream().reduce(Math::addExact);
        while (produceCapacity.get() + this.currentCapacity > this.CAPACITY) {
            try {
                System.out.println("Склад полный, жду отгрузки");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Map.Entry<String, Integer> entry : producedProducts.entrySet()) {
            products.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        this.currentCapacity = this.currentCapacity + produceCapacity.get();
        System.out.println(Thread.currentThread().getName());
        publishSmeta();
        notify();
    }

    public void publishSmeta() {
        System.out.println("Текущий состав склада: " + this.products.entrySet());
        System.out.println("Осталось места: " + (this.CAPACITY - this.currentCapacity));
    }

}
