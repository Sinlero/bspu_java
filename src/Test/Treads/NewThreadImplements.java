package Test.Treads;

public class NewThreadImplements implements Runnable {
    private String name;
    private Thread thread;

    NewThreadImplements(String name) {
        thread = new Thread(this, name);
        System.out.println("ImplementThread created " + thread);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public void run() {
        try {
            for (int i = 11; i > 0; i--) {
                System.out.println("ImplementThread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exception) {
            System.out.println("ImplementThread interrupted");
        }
        System.out.println("\t\tImplementThread end");
    }
}
