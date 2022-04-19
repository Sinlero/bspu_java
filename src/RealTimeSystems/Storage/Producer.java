package RealTimeSystems.Storage;

import java.util.Map;

public class Producer extends Thread {

    private Map<String, Integer> products;
    private Storage storage;

    public Producer(String name, Map<String, Integer> products, Storage storage) {
        super(name);
        this.products = products;
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.setProducts(products);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
