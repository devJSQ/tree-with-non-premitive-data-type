import java.util.Stack;

class Node {

    // Data
    /* your code here 1 - create String (name) attribute to store the names  */ 

    // Pointers
    /* your code here 2 - Create 3 pointer (left, center, right) */ 
     

    // Constructor
    Node(String name) {
        this.name = name;
        this.left = null;
        this.center = null;
        this.right = null;
    }

}

public class Tree {

    Node root;

    Tree(String name) {
        root = new Node(name);
    }

    Tree() {
        root = null;
    }
    

    // Print tree values function
    public void printTreeValues(Node root) {

        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            System.out.println(currentNode.name);

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }

            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }

            if (currentNode.center != null) {
                stack.push(currentNode.center);
            }

        }

        return;
    }

    public static void main(String[] args) {

         /* your code here 3 - Create Tree with than name (T) */ 

        // Create tree root (node object) with the name "Ahmed"
        T.root = new Node("Ahmed");

        System.out.println("Print root value");
         /* your code here 4 - Accecc the root data (name) and print it */ 

        /* your code here 5 - Update the root data (name) to be Mohammed */ 

        /* your code here 6 - Create root child (left child) with the name "Ali"*/ 

        System.out.println("Print tree values");
        /* your code here 7 - Print tree values */ 

    }

}
