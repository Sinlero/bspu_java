package DataStructures.Stack;

public interface IntStack {
    void push(int value);
    int pop();
    int size();
    default void clear() {
        System.out.println("Method not realize");
    }
    default void show() {}
}
