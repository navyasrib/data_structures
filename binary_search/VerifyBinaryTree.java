public class VerifyBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(15);
        binaryTree.insert(10);
        binaryTree.insert(20);
        System.out.println(binaryTree.search(10));
    }
}
