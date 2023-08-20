package leetcode.BST;

public class isSymmetric {
    Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public static boolean isSymmetric(Node root){
        return helper(root.left, root.right);
    }
    public static boolean helper(Node leftSubtree, Node rightSubtree){
        if (leftSubtree == null && rightSubtree ==null)return true;
        if(leftSubtree == null || rightSubtree == null || leftSubtree.value != rightSubtree.value) return false;
        return helper(leftSubtree.left, rightSubtree.right) && helper(leftSubtree.right, rightSubtree.left);
    }
    public static void main(String[] args){
        isSymmetric s = new isSymmetric();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.right= new Node(3);
        root.right.left= new Node(4);

        System.out.println("Is the tree the symmetric?\n" +s.isSymmetric(root));
    }
    
}
