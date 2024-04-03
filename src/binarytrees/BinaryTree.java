package binarytrees;

public class BinaryTree {

    private Node root;

    Node getRoot() {
        //Objects.requireNonNull(this.root, "'root' must not be null");
        return root;
    }

    Node binarySearch(int value) {
        if (value == root.getValue())
            return root;
        return binarySearch(value, root);
    }

    private Node binarySearch(int value, Node pointernode) {
        if (value == pointernode.getValue())
            return pointernode;
        else if (value < pointernode.getValue())
            return binarySearch(value, pointernode.getLeftChild());
        else return binarySearch(value, pointernode.getRightChild());
    }

    Node insert(int value) {
        if (root != null)
            return insert(value, this.root);
        this.root = new Node(value);
        return root;
    }

    private Node insert(int value, Node pointerNode) {

        if (pointerNode == null) {
            Node newNode = new Node(value);
            return newNode;
        } else if (value < pointerNode.getValue())
            return insert(value, pointerNode.getLeftChild());
        else return insert(value, pointerNode.getRightChild());
//
//        if(pointerNode.leftChild == null) {
//            pointerNode.leftChild = new Node(value, null, null);
//            return pointerNode.leftChild;
//        }
//
//        if(pointerNode.rightChild == null) {
//            pointerNode.rightChild = new Node(value, null, null);
//            return pointerNode.rightChild;
//        }
//
//        Node insertedLeftNode = insert(pointerNode.leftChild, value);
//        if (insertedLeftNode != null) {
//            return insertedLeftNode;
//        }
//
//        Node insertedRightNode = insert(pointerNode.rightChild, value);
//        if (insertedRightNode != null) {
//            return insertedRightNode;
//        }
    }


//
//
//    void deleteByValue(int value) {}
//
//    void deleteSubTree(int value){}
//

}
