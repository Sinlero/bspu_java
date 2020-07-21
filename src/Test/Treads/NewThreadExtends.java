package Test.Treads;

public class NewThreadExtends extends Thread {
    private String name;

    NewThreadExtends(String name) {
        super(name);
        System.out.println("ExtendsThread " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("ExtendsThread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exception) {
            System.out.println("ExtendsThread interrupted");
        }
        System.out.println("\t\tExtendsThread end");
    }
}
