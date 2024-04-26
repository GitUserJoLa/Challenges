package binarytrees;

class Node {

    final int value;
    Node leftChild;
    Node rightChild;

    Node(int value) {
        this(value, null, null);
    }

    private Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    void setLeftChild(Node node) {
        this.leftChild = node;
    }

    void setRightChild(Node node) {
        this.rightChild = node;
    }
}
