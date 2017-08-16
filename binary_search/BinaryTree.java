class BinaryTree {
    BinaryNode root;

    BinaryTree() {
        this.root = null;
    }


    BinaryNode insert(int data) {
        if (root == null) {
            root = new BinaryNode(data);
        } else if (data <= root.getData()) {
            root = root.getLeft();
            BinaryNode node = insert(data);
            root.setLeft(node);
        } else {
            root = root.getRight();
            BinaryNode node = insert(data);
            root.setRight(node);
        }
        return root;
    }

    boolean search(int data) {
        if (root == null)
            return false;
        else if (data == root.getData())
            return true;
        else if (data <= root.getData()){
            root = root.getLeft();
            return search(data);
        }
        else {
            root = root.getRight();
            return search(data);
        }
    }
}
