package binarytrees;

import java.util.Objects;

class Node {

    private int value;
    private Node leftChild;
    private Node rightChild;

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


//
//    Node(int value, int leftChildValue, int rightChildValue){
//        this.value = value;
//        this.leftChild = new Node(leftChildValue);
//        this.rightChild = new Node(rightChildValue);
//    }
//
//

//
//    private void setLeftChild(int value) {
//        this.leftChild = new Node(value);
//    }
//

//
//    private void setRightChild(int value) {
//        this.rightChild = new Node(value);
//    }
//

}
