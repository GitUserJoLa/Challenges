package binarytrees;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BinaryTree {
    private Node root;

    Node getRoot() {
        return root;
    }

    Node binarySearch(int value) {
        return binarySearch(value, root);
    }

    private @Nullable Node binarySearch(int value, Node pointerNode) {

        if (pointerNode == null) {
            System.out.println("Could not find Node with value of " + value);
            return null;
        }

        if (value == pointerNode.value)
            return pointerNode;
        else if (value < pointerNode.value)
            return binarySearch(value, pointerNode.leftChild);
        else return binarySearch(value, pointerNode.rightChild);
    }

    Node insert(int value) {
        root = insert(value, root);
        return root;
    }

    private @NotNull Node insert(int value, Node pointerNode) {
        if (pointerNode == null) {
            pointerNode = new Node(value);
        } else if (value < pointerNode.value) {
            Node newNode = insert(value, pointerNode.leftChild);
            pointerNode.setLeftChild(newNode);
        } else {
            Node newNode = insert(value, pointerNode.rightChild);
            pointerNode.setRightChild(newNode);
        }
        return pointerNode;
    }


//
//
//    void deleteByValue(int value) {}
//
//    void deleteSubTree(int value){}
//

}
