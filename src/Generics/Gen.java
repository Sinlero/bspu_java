package Generics;

public class Gen<T> {
    T object;

    public Gen(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void showType() {
        System.out.println("Обобщённым типом Т является: " + this.object.getClass().getTypeName());
    }
}
