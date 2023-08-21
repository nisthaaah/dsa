package leetcode.BST;

public class balancedBinaryTree { //difference in heights between the left and right subtrees of any node is either 0 or 1.
    Node root; 

    static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

public boolean isBalanced(Node root){
    if (root == null) return true;
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);

}

public int height(Node root){
        if(root == null) return 0;                          
        int left = height(root.left);                  
        int right = height(root.right);                 
        return Math.max(left, right) +1 ;           
    }

public static void main(String[] args){
    balancedBinaryTree bt = new balancedBinaryTree();

    Node root = new Node(3);
    root.left = new Node(9);
    root.right = new Node(20);
    root.right.right= new Node(7);
    root.right.left= new Node(15);

    System.out.println("Is the binary tree balanced? \n" +bt.isBalanced(root));
    }   
}
