class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public class recursion {
        public static void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
    
            System.out.print(root.val + " "); // Process the current node
            dfs(root.left); // Recur on the left subtree
            dfs(root.right); // Recur on the right subtree
        }
    
        public static void main(String[] args) {
            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(3);
            root.right = new TreeNode(8);
            root.left.left = new TreeNode(1);
            root.left.right = new TreeNode(4);
            root.right.left = new TreeNode(7);
            root.right.right = new TreeNode(9);
    
            recursion dfs = new recursion();
            System.out.println("DFS Traversal:");
            dfs.dfs(root);
        }
    }

