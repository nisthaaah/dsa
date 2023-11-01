package leetcode.BST;
import java.util.*;

public class minDepth {
    Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }
    public static int minDepth(Node root){
        if (root == null) return 0 ;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 1;

        while(!q.isEmpty()){
            int qSize = q.size();
            while(qSize > 0){
                qSize--;

                Node currNode = q.remove();
                if(currNode == null) continue;
                if(currNode.left == null && currNode.right == null){
                    return depth;
                }
                else{
                    q.add(currNode.left);
                    q.add(currNode.right);
                }
                depth++;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        minDepth m = new minDepth();

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.right= new Node(7);
        root.right.left= new Node(15);

        System.out.println("The minimum depth is: \n" +m.minDepth(root));
    }
}
