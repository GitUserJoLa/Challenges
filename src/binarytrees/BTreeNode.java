package binarytrees;

public class BTreeNode {
    int[] keys;
    int t;
    BTreeNode[] child;
    int n;
    boolean leaf;

    BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        keys = new int[2*t - 1];
        child = new BTreeNode[2*t];
        n = 0;
    }

}
