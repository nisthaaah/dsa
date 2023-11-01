package leetcode.BST;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class modeBST {
    Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public int[] mode(Node root){
        Map<Integer, Integer> count = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.remove();
            count.put(curr.value, count.getOrDefault(curr.value, 0) + 1);
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }

        int maxCount = 0;
        for(int key : count.keySet()){
            maxCount = Math.max(maxCount, count.get(key));
        }
        List<Integer> ans = new ArrayList<>();
        for(int key : count.keySet()){
            if(count.get(key) == maxCount){
                ans.add(key);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.right.left= new Node(2);
        root.right.right = new Node(1);

        int[] res = new modeBST().mode(root);

        System.out.print("The mode: ");
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}