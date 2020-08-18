package DataStructures.Stack;

public class DynamicStack<T> implements Stack<T> {
    int peack;
    T[] data;

    public DynamicStack(int size) {
        data = (T[]) new Object[size];
        peack = -1;
    }

    public void push(T value) {
        if (peack >= size() - 1) {
            T[] tmp = (T[]) new Object[size() * 2];
            for (int i = 0; i < size(); i++) {
                tmp[i] = data[i];
            }
            data = tmp;
        }
        data[++peack] = value;
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
    public void show() {
        for (int i = 0; i <= peack; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            data[i] = null;
        }
    }
}
