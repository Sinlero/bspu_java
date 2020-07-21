package Test.Treads;

public class TreadMainTest {
    public static void main(String[] args) {
        NewThreadImplements threadImplements0 = new NewThreadImplements("First");
        NewThreadExtends threadExtends = new NewThreadExtends("Second");
        NewThreadImplements threadImplements1 = new NewThreadImplements("Third");
        System.out.println("thread 0 " + threadImplements0.getThread().isAlive());
        System.out.println("thread 1 " + threadExtends.isAlive());
        System.out.println("thread 2 " + threadImplements1.getThread().isAlive());
        try {
            threadImplements0.getThread().join();
            threadExtends.join();
            threadImplements1.getThread().join();
        } catch (InterruptedException exception) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("thread 0 " + threadImplements0.getThread().isAlive());
        System.out.println("thread 1 " + threadExtends.isAlive());
        System.out.println("thread 2 " + threadImplements1.getThread().isAlive());
        System.out.println("\t\tMain thread end");
    }
}
