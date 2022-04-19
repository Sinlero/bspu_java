package RealTimeSystems.Storage;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <String, Integer> startProds = new HashMap<>();
        startProds.put("Potato", 100);
        startProds.put("Tomato", 100);
        startProds.put("Cola", 100);
        Storage storage = new Storage(startProds);

        Map <String, Integer> producingProds = new HashMap<>();
        producingProds.put("Potato", 25);
        producingProds.put("Cola", 25);
        producingProds.put("Tomato", 25);

        Map <String, Integer> gettingProds = new HashMap<>();
        gettingProds.put("Potato", 20);
        gettingProds.put("Cola", 20);
        gettingProds.put("Tomato", 20);

        System.out.println("Стартовый состав склада:");
        storage.publishSmeta();
        new Consumer(String.format("Consumer № %d", 1), gettingProds, storage).start();
        new Producer(String.format("Producer № %d", 1), producingProds, storage).start();
    }
}
