package leetcode.Trees;

import java.util.ArrayList;

class Node {
   int val;
   Node root;
   Node left;
   Node right;
   Node() {}
   Node(int val) { this.val = val; }
   Node(int val, Node left, Node right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
} 

public class invertBT {
    public Node invertTree(Node root){
        if(root == null) return root;
        invertTree(root.left);
        invertTree(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
    public static void main(String[] args) {
        invertBinaryTree solution = new invertBinaryTree();

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
        //[4,2,7,1,3,6,9]

        ArrayList<Integer> result = solution.invert(root);
        System.out.println("Inverted Binary Tree: " +result);
    }
}