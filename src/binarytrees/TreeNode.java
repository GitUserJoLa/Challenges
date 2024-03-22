package binarytrees;

/*
You are given a class called binarytrees.TreeNode.
Implement the method isPerfect() which determines if a given tree denoted by its root node is perfect.
https://www.codewars.com/kata/57dd79bff6df9b103b00010f
 Credits to janitormeir
 */
public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    /*
    binarytrees.TreeNode(){}
     */
    /*
    binarytrees.TreeNode(int value, binarytrees.TreeNode left, binarytrees.TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

     */

    /*
    binarytrees.TreeNode(int value) {
        this(value, null, null);
    }

     */

    public static boolean isPerfect(TreeNode root) {
        return false; // TODO: implementation
    }
    static TreeNode leaf() {
        return new TreeNode();
    }

    static TreeNode join(TreeNode left, TreeNode right) {
        return new TreeNode().withChildren(left, right);
    }

    TreeNode withLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    TreeNode withRight(TreeNode right) {
        this.right = right;
        return this;
    }

    TreeNode withChildren(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        return this;
    }

    TreeNode withLeftLeaf() {
        return withLeft(leaf());
    }

    TreeNode withRightLeaf() {
        return withRight(leaf());
    }

    TreeNode withLeaves() {
        return withChildren(leaf(), leaf());
    }
    @Override
    public boolean equals(Object other) {
        // TODO: IMPLEMENTATION
        // Already implemented for you and used in test cases
        return false;
    }
}
