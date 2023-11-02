package leetcode.Trees;

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

public class averageOfSubtree {
    int count = 0;
    public int average(Node root){
        dfs(root);
        return count;
    }

    public int[] dfs(Node root){
        if(root == null){
            return new int[] {0,0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int currSum = left[0] + right[0] +root.val;
        int currCount = left[1] + right[1] + 1;

        if(currSum / currCount == root.val){
            count++;
        }
        return new int[] {currSum, currCount};
    }
    public static void main(String[] args) {
        averageOfSubtree av = new averageOfSubtree();

        Node root = new Node(4);
        root.left = new Node(8);
        root.right = new Node(5);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.right.right = new Node(6);

        int res = av.average(root);

        System.out.println("The count where the value of the node is equal to the average of the values in its subtree: " +res);
    }
}