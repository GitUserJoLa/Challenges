package binarytrees;

import java.util.Objects;

class Node {

    int value;
    Node leftChild;
    Node rightChild;
//    private Node parent;

    Node(int value) {
        this(value, null, null);
    }

    Node(int value, Node leftChild, Node rightChild) {
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
