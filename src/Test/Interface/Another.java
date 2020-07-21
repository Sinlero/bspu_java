package Test.Interface;

public class Another implements Callback {
    public void callback(int param) {
        System.out.println("Ещё один вариант реализации callback()");
        System.out.println("P в квадрате равно " + (param*param));
    }
}
