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

    int getValue() {
        //throws a NullPointerException
        //when referencing to child nodes that are null
        Objects.requireNonNull(this, "'this' must not be null");
        return this.value;
    }

    Node getLeftChild() {
        //if (leftChild == null) System.out.println("Warning: Left Child is null");
        return leftChild;
    }

    Node getRightChild() {
        //if (rightChild == null) System.out.println("Warning: Right Child is null");
        return rightChild;
    }

    void setLeftChild(Node node) {
        this.leftChild = node;
    }

    void setRightChild(Node node) {
        this.rightChild = node;
    }
}
