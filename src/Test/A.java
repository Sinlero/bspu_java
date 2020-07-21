package Test;

public class A {
    private int j;
    void callMe() {
        System.out.println("A");
    }
    void show() {
        System.out.println(j);
    }
}

class B extends A {
    int i;

    B() {
    }

    B(B object) {
        i = object.i;
    }

    void callMe() {
        System.out.println("B");
    }

    void privateMetod() {
        System.out.println("i am hidden");
        System.out.println(i);
    }

    void setI(int value) {
        i = value;
    }

    void show() {
        System.out.println(i);
    }
}

class C extends A {
    void callMe() {
        System.out.println("C");
    }
}
