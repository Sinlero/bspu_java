package DataStructures;

public class Stack {
    private final int[] items;
    private int peack = -1;

    Stack() {
        items = new int[10];
    }

    Stack(int size) {
        items = new int[size];
    }

    public void push(int item) {
        if (peack == items.length - 1) {
            System.out.println("Stack overflow");
        } else {
            items[++peack] = item;
        }
    }

    public int pop() {
        if (peack < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return items[peack--];
        }
    }

    public int size() {
        return items.length;
    }

}
