package leetcode.BST;

public class hasPathSum {
    Node root; 

    static class Node{            
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }
    public boolean hasPath(Node root, int targetSum){
        if (root == null) return false;
        if(root.left == null && root.right == null && targetSum - root.value == 0) return true; //true
        return hasPath(root.left, targetSum - root.value) || hasPath(root.right, targetSum - root.value); //(5, 17) || (4, 13) || (11, 2) || (11, 0)
    }    
    public static void main(String[] args){
        hasPathSum s = new hasPathSum();
    
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        int targetSum = 22;
    
        System.out.println("Does the tree have a path with sum " + targetSum + "?\n" +s.hasPath(root, targetSum));
    }
}

//          5
//         / \
//        4   8
//       /   / \
//      11  13  4
//     /  \      \
//    7    2      1
