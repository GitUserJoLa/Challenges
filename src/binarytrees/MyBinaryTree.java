package binarytrees;

abstract class MyBinaryTree {
    MyNode root;
    //int value;

    abstract MyNode add(int value);
    abstract void deleteSingleNode(int value);
    abstract void deleteSubTree(int value);
}
