package DataStructure.BinarySearchTree;

public class BSTImplementation {
    public static void main(String[] args) {
        BST tree = new BST();
        Node root = null;
        root = tree.insert(root, 56);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);

        System.out.println(root);
    }
}