package DataStructures.Stack;

public class FixedStack implements IntStack {
    private int peack = -1;
    private int[] data;

    public FixedStack(int size) {
        data = new int[size];
    }

    public void push(int value) {
        if (peack >= size() - 1) {
            System.out.println("Stack overflow");
        } else {
            data[++peack] = value;
        }
    }

    public int pop() {
        if (peack < 0) {
            System.out.println("Stack is empty");
            return 0;
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
            data[i] = 0;
        }
    }

    public void show() {
        for (int i = 0; i < size(); i++) {
            System.out.println(data[i]);
        }
    }
}
