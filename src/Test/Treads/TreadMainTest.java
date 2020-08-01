package Test.Treads;

import java.math.BigDecimal;

public class TreadMainTest {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
//        NewThreadImplements threadImplements0 = new NewThreadImplements("First");
//        NewThreadExtends threadExtends = new NewThreadExtends("Second");
//        NewThreadImplements threadImplements1 = new NewThreadImplements("Third");
//        System.out.println("thread 0 " + threadImplements0.getThread().isAlive());
//        System.out.println("thread 1 " + threadExtends.isAlive());
//        System.out.println("thread 2 " + threadImplements1.getThread().isAlive());
//        try {
//            threadImplements0.getThread().join();
//            threadExtends.join();
//            threadImplements1.getThread().join();
//        } catch (InterruptedException exception) {
//            System.out.println("Main thread is interrupted");
//        }
//        System.out.println("thread 0 " + threadImplements0.getThread().isAlive());
//        System.out.println("thread 1 " + threadExtends.isAlive());
//        System.out.println("thread 2 " + threadImplements1.getThread().isAlive());
//        System.out.println("\t\tMain thread end");


//        for (int i = 0; i < 2; i++) {
//            System.out.println(Factorial.calculate(5000));   6800 milliseconds
//        }

        MathTread thread1 = new MathTread("FirstFactorial", 500);    //   58 milliseconds
        MathTread thread2 = new MathTread("SecondFactorial", 500);   //
        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("********");
        System.out.println(System.currentTimeMillis() - time);
        System.out.println("********");
    }
}
