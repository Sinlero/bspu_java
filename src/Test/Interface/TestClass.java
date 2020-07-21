package Test.Interface;

public class TestClass implements Callback {
    public void callback(int param) {
        System.out.println(param);
    }
    public void myOwnMethod() {
        System.out.println("Метод класса не реализующий интерфейс");
    }
}
