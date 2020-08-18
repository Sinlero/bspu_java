package DataStructures.Stack;

public class FixedStack<T> implements Stack<T> {
    private int peack = -1;
    private T[] data;

    public FixedStack(int size) {
        data =(T[]) new Object[size];
    }

    public void push(T value) {
        if (peack >= size() - 1) {
            System.out.println("Stack overflow");
        } else {
            data[++peack] = value;
        }
    }

    public T pop() {
        if (peack < 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return data[peack--];
        }
    }

    public int size() {
        return data.length;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            data[i] = null;
        }
    }

    public void show() {
        for (int i = 0; i < size(); i++) {
            System.out.println(data[i]);
        }
    }
}
