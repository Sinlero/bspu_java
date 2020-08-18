package DataStructures.Stack;

public class PrimitiveStack<T> {
    private final T[] items;
    private int peack = -1;

    public PrimitiveStack() {
        items =(T[]) new Object[10];
    }

    public PrimitiveStack(int size) {
        items = (T[]) new Object[size];
    }

    public void push(T item) {
        if (peack == items.length - 1) {
            System.out.println("Stack overflow");
        } else {
            items[++peack] = item;
        }
    }

    public T pop() {
        if (peack < 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return items[peack--];
        }
    }

    public int size() {
        return items.length;
    }

}
