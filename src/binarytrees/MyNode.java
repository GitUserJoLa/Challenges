package binarytrees;

class MyNode extends MyBinaryTree {
    private MyNode leftChild;
    private MyNode rightChild;
    private int value;

    MyNode() {
        this(0, null, null);
    }

    MyNode(int value) {
        this(value, null, null);
    }

    MyNode(int value, MyNode leftChild, MyNode rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    MyNode getLeftChild() {
        return leftChild;
    }

    void setLeftChild(int value) {
        this.leftChild = new MyNode(value);
    }

    MyNode getRightChild() {
        return rightChild;
    }

    void setRightChild(int value) {
        this.rightChild = new MyNode(value);
    }

    int getValue() {
        return value;
    }

    @Override
    MyNode add(int value) {
        return null;
    }

    @Override
    void deleteSingleNode(int value) {

    }

    @Override
    void deleteSubTree(int value) {

    }
}
