package leetcode.BST;

public class countNodes {
    Node root; 

    static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }
    public int countNodes(Node root){
        if(root == null) return 0;
        int lh = leftHeight(root);
        int rh = rightHeight(root);
        if(lh == rh){
            return (int)(Math.pow(2, lh) - 1);
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    public int leftHeight(Node root){
        if(root == null) return 0;
        return leftHeight(root.left) + 1;
    }
    public int rightHeight(Node root){
        if(root == null) return 0;
        return rightHeight(root.right) + 1;
    }

    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left= new Node(6);
        //root.right.right= new Node(7);
    
        System.out.println("The number of nodes are: " +new countNodes().countNodes(root));
    }   
}