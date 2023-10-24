package leetcode.Trees.dfs;

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

public class postOrderDfs {
    public void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        postOrderDfs po = new postOrderDfs();
    
            Node root = new Node(4);
            root.left = new Node(2);
            root.right = new Node(7);
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right.left = new Node(6);
            root.right.right = new Node(9);
        
            System.out.print("Postorder Traversal: ");
            po.postOrder(root);
        }
}
