package leetcode.Trees;
import java.util.*;

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

public class invertBinaryTree{
    public ArrayList<Integer> invert(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        Node currNode = root; //4
        q.add(currNode); //4
        while(q.size() > 0){
            currNode = q.remove(); //4, 7
            res.add(currNode.val); //4, 7
                                                        //queue => 4, 7(curr), 2(curr), 9, 6, 3, 1
            if(currNode.right != null){ //curr => 7    //res => 4, 7, 2, 9, 6, 3, 1
                q.add(currNode.right); //7,9
            }
            if(currNode.left != null){ //curr => 7
                q.add(currNode.left); //2, 6
            }
        }
        return res;
    }

    public static void main(String[] args) {
        invertBinaryTree solution = new invertBinaryTree();

        // Create a sample binary tree
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