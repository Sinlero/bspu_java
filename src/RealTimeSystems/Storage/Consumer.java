package RealTimeSystems.Storage;

import java.util.Map;

public class Consumer extends Thread{

    private Map<String, Integer> products;
    private Storage storage;

    public Consumer(String name, Map<String, Integer> products, Storage storage) {
        super(name);
        this.products = products;
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.getProducts(products);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
