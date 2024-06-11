import java.util.Stack;

class Node {

    // Data
    String name;
    // Pointers
    Node left;
    Node center;
    Node right;

    // Constructor
    Node(String name) {
        this.name = name;
        this.left = null;
        this.center = null;
        this.right = null;
    }

}

class Tree {

    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Tree() {
        root = null;
    }

    public void printTree(){
        if (root == null){
            System.out.println("empty");
            return;
        }

        Stack <Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node cNode = stack.pop();

            System.out.println(cNode.name);

            if(cNode.right != null){
                stack.push(cNode.right);
            }
            if(cNode.left != null){
                stack.push(cNode.left);

            }
            if (cNode.center != null) {
                stack.push(cNode.center);
            }
        }
    }


    public boolean searchTree(String e){
        if (root == null){
            System.out.println("empty");
            return false;
        }

        Stack <Node> stack = new Stack<Node>();
        stack.push(root);

        boolean found = false;


        while (!stack.isEmpty()) {
            Node cNode = stack.pop();

            if(cNode.name == e){
                System.out.println(cNode.name);
                found = true;
            }

           

            if(cNode.right != null){
                stack.push(cNode.right);
            }
            if(cNode.left != null){
                stack.push(cNode.left);

            }
            if (cNode.center != null) {
                stack.push(cNode.center);
            }
        }
        return found;
    }
    

   
    // 2 - Write function that search for a pecific name in the tree and returns true if the it's found and return false otherwis 
    /* Your code here  */ 

    

    public static void main(String[] args) {
        Tree t1 = new Tree(new Node("ahmad"));
        System.out.println(t1.root.name);
        t1.root.name = "Anas";
        t1.root.right = new Node("Sami");
        t1.root.right.left = new Node("jasser");
        t1.root.right.left.left = new Node("lina");
        t1.root.center = new Node("Fatima");
        t1.root.center.left = new Node("faisal");
        t1.root.center.right = new Node("rashed");
        t1.root.left = new Node("Abdullah");
        t1.root.left.right = new Node("maha");
        t1.root.left.center = new Node("yasser");
        t1.root.left.left = new Node("salem");

        t1.printTree();
        System.out.println(t1.searchTree("rashed"));

        
        
/* 
   

    5 - Access and update the root data to be (Anas)
    6 - Create root children as the image above shows
    7 - Print tree values
    8 - Search for (Rashed) call the search method
*/
        
        /* Your code here  */ 

    }

}
