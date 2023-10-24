package leetcode.Trees.bfs;
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


public class breadthFirstSearch {
    public List<Integer> bfs(Node root){
        Node curr = root;
        Queue<Node> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        q.add(curr); //4
        while(q.size() > 0){
            curr = q.remove();
            res.add(curr.val); //4, 2, 7

            if(curr.left != null){
                q.add(curr.left); //2
            }
            if(curr.right != null){
                q.add(curr.right); //7
            }
        }
        return res;
    }

    public static void main(String[] args) {
        breadthFirstSearch b = new breadthFirstSearch();

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        List<Integer> res = b.bfs(root);
        System.out.println("The BFS: " +res);
    }
}
