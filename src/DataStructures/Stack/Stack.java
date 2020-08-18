package DataStructures.Stack;

public interface Stack<T> {
    void push(T value);
    T pop();
    int size();
    default void clear() {
        System.out.println("Method not realize");
    }
    default void show() {}
}
