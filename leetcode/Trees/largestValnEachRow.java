package leetcode.Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class largestValnEachRow {
    public List<Integer> largestValues(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(q.size() > 0){
        int levelSize = q.size();
        int currMax = Integer.MIN_VALUE;
        for(int i = 0; i < levelSize; i++){
        Node curr = q.remove();
        currMax = Math.max(currMax, curr.val);

        if(curr.left != null){
            q.add(curr.left);
        }
        if(curr.right != null){
            q.add(curr.right);
        }
        }
        res.add(currMax);
    }
    return res;
    }

    public static void main(String[] args) {
        largestValnEachRow l = new largestValnEachRow();

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        List<Integer> res = l.largestValues(root);
        System.out.println("The largest value in each row of the tree: " +res);
    }
}
