package Test.Treads;

public class MathTread implements Runnable {
    private Thread thread;
    private String name;
    private long value;

    public MathTread(String name, long value) {
        thread = new Thread(this,name);
        this.name = name;
        this.value = value;
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        Factorial.calculate(value);
    }
}
