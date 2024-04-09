package binarytrees;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BinaryTree {
    private Node root;

    Node getRoot() {
        return root;
    }

    public Node binarySearch(int value) {
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

    public Node insert(int value) {
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

    private @Nullable Node searchParent(int value, Node pointerNode) {
        if (pointerNode == null) {
            System.out.println("Could not find Node with value of " + value);
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
        Node parent = searchParent(value, root);

        if (toDelete != null)
            System.out.println("Node to be deleted - nodeValue: " + toDelete.value + ", nodeAddress: " + toDelete +
                    "\n - parentValue: " + parent.value + ", parentAddress: " + parent);


        // case 1:  Node doesn't have children -> Node is a leaf
        //          set pointer from parent node to leaf to null
        //          ~> write function to search for parent node

        // case 2:  Node has one child
        //          search parent node
        //          replace pointer to child node with pointer to grandchild node

        // case 3:  Node has two children

        // case 4: Node is root with two children
    }


//    public int height(){return 0;}
//    public int numNodes(){return 0;}
//    public List<Node> toList() {return null;} // mit Lists.toArray() laesst sich easy ein array erzeugen
//    public BinaryTree balance() {return null;}
////    implements Serializable


}
