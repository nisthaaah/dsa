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

public class inOrderDfs {
    public void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        inOrderDfs i = new inOrderDfs();
    
            Node root = new Node(4);
            root.left = new Node(2);
            root.right = new Node(7);
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right.left = new Node(6);
            root.right.right = new Node(9);
        
        System.out.print("Inorder Traversal: ");
        i.inOrder(root);
    }
}