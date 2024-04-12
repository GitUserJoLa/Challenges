package binarytrees;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BinaryTree {
    private Node root = null;

    Node getRoot() {
        return root;
    }

    public Node binarySearch(int value) {
        return binarySearch(value, root);
    }

    private @Nullable Node binarySearch(int value, Node parentNode) {
        if (parentNode == null) {
            System.out.println("Could not find Node with value of " + value);
            return null;
        }

        if (value == parentNode.value)
            return parentNode;
        else if (value < parentNode.value)
            return binarySearch(value, parentNode.leftChild);
        else return binarySearch(value, parentNode.rightChild);
    }

    public Node insert(int value) {
//        unexpected return value
//        always returns the root
        Node insertedNode = insert(value, root);
//        System.out.println("get into insert function: insertedNodeValue: " + insertedNode.value + "; insertedNodeAddress: " + insertedNode);
        if (root == null)
            root = insertedNode;
        return insertedNode;
    }

    private Node insert(int value, Node parentNode) {
//keeps tree intact, but doesn't return the inserted node
        if (parentNode == null) {
            parentNode = new Node(value);
        } else if (value < parentNode.value) {
            Node newNode = insert(value, parentNode.leftChild);
            parentNode.setLeftChild(newNode);
        } else {
            Node newNode = insert(value, parentNode.rightChild);
            parentNode.setRightChild(newNode);
        }
        return parentNode;

//returns inserted node, but breaks the tree
//        if (parentNode == null) {
//            return new Node(value);
//        } else if (value < parentNode.value) {
//            Node newNode = insert(value, parentNode.leftChild);
//            parentNode.setLeftChild(newNode);
//            return newNode;
//        } else {
//            Node newNode = insert(value, parentNode.rightChild);
//            parentNode.setRightChild(newNode);
//            return newNode;
//        }
    }

    private @Nullable Node searchParent(int value, Node pointerNode) {
        if (pointerNode == null) {
            System.out.println("Did not find Node with value of " + value);
            return null;
        }

        if ((pointerNode.leftChild != null && value == pointerNode.leftChild.value) ||
                (pointerNode.rightChild != null && value == pointerNode.rightChild.value))
            return pointerNode;
        else if (value < pointerNode.value)
            return searchParent(value, pointerNode.leftChild);
        else
            return searchParent(value, pointerNode.rightChild);
    }

    public void deleteValue(int value) {
        Node toDelete = binarySearch(value);
//        deleteValue(toDelete);
    }

    public void deleteValue(Node toDelete) {
        if (toDelete == null)
            return;
        int nodeValue = toDelete.value;
        Node parent = searchParent(nodeValue, root);

        System.out.println("Node to be deleted - nodeValue: " + toDelete.value + ", nodeAddress: " + toDelete +
                "\n - parentValue: " + parent.value + ", parentAddress: " + parent);


        // case 1:  Node doesn't have children -> Node is a leaf
        //          set pointer from parent node to leaf to null
        //          ~> write function to search for parent node

        // case 2:  Node has one child
        //          search parent node
        //          replace pointer to child node with pointer to grandchild node

        // case 3:  Node has two children

        // (case 4: Node is root with two children)
    }

//    public int height(){return 0;}
//    public int numNodes(){return 0;}
//    public List<Node> toList() {return null;} // mit Lists.toArray() laesst sich easy ein array erzeugen
//    public BinaryTree balance() {return null;}
////    implements Serializable
}
