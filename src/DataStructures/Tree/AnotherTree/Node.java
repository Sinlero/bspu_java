package DataStructures.Tree.AnotherTree;

public class Node {
    private Node brother;
    private Node child;
    private int value;

    public Node(int value, Node brother, Node child) {
        this.value = value;
        this.brother = brother;
        this.child = child;
    }

    public Node getBrother() {
        return brother;
    }

    public void setBrother(Node brother) {
        this.brother = brother;
    }

    public Node getChild() {
        return child;
    }

    public void setChild(Node child) {
        this.child = child;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
