package DataStructures.Tree.Binary;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(Node left, int value, Node right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
