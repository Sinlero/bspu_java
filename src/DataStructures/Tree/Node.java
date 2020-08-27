package DataStructures.Tree;

public class Node<T> {
    private T value;
    private Node left;
    private Node right;

    public Node(Node left, T value, Node right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }
}
