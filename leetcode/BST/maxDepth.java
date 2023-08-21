package leetcode.BST;

public class maxDepth {
    Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }
    public static int maxDepth(Node root){
        if(root == null) return 0;                          //  3     (0) (2) => 3
        int left = maxDepth(root.left);                    //  / \
        int right = maxDepth(root.right);                 //  9  20   (0) (1) => 2
        return Math.max(left, right) +1 ;                //      / \
    }                                                   //      15  7 (0) (0) => 1  [max(left, right) +1]
    public static void main(String[] args){
        maxDepth m = new maxDepth();

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.right= new Node(7);
        root.right.left= new Node(15);

        System.out.println("The maximum depth is: \n" +m.maxDepth(root));
    }
    
}
