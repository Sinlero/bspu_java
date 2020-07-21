package DataStructures.Stack;

public class DynamicStack implements IntStack {
    int peack;
    int[] data;

    public DynamicStack(int size) {
        data = new int[size];
        peack = -1;
    }

    public void push(int value) {
        if (peack >= size() - 1) {
            int[] tmp = new int[size() * 2];
            for (int i = 0; i < size(); i++) {
                tmp[i] = data[i];
            }
            data = tmp;
        }
        data[++peack] = value;
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
    public void show() {
        for (int i = 0; i < size(); i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            data[i] = 0;
        }
    }
}
