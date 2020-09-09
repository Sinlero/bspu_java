package DataStructures.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.insert(9);
        tree.insert(11);
        tree.insert(15);
        tree.insert(14);

        System.out.println(tree.getHeight());
    }
}
