package DataStructures.Tree.AnotherTree;

public class Tree {
    private Node root;
    private Node tmp;

    public Tree (int value) {
        root = new Node(value, null, null);
    }

    public Node find(int value) {
        Node current = root;
        while (current.getValue() != value) {
            tmp = current;
            if (value >= current.getValue()) {
                current = current.getBrother();
            } else {
                current = current.getChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int value) {
        Node current = find(value);
        if (current == null) {
            if (value >= tmp.getValue()) {
                tmp.setBrother(new Node(value, null, null));
            } else {
                tmp.setChild(new Node(value, null, null));
            }
        }
    }
}
