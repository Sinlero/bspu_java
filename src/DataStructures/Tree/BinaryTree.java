package DataStructures.Tree;

public class BinaryTree {
    private Node root;
    private Node tmp;

    public BinaryTree(int value) {
        root = new Node(null, value, null);
    }

    public Node find(int value) {
        Node current = root;
        while (current.getValue() != value) {
            tmp = current;
            if (value < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
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
            if (value > tmp.getValue()) {
                tmp.setRight(new Node(null, value, null));
            } else {
                tmp.setLeft(new Node(null, value, null));
            }
        } else {
            current.setRight(new Node(null, value, null));
        }
    }

    public void inOrder() {
        orderVisit(root);
    }

    public void inReverseOrder(){
        reverseOrderVisit(root);
    }

    private void orderVisit(Node node) {
        if (node != null) {
            orderVisit(node.getLeft());
            System.out.println(node.getValue());
            orderVisit(node.getRight());
        }
    }

    private void reverseOrderVisit(Node node) {
        if (node != null) {
            reverseOrderVisit(node.getRight());
            System.out.println(node.getValue());
            reverseOrderVisit(node.getLeft());
        }
    }
}
