package leetcode.Trees;
import java.util.*;

class TreeNode {
    public int val;
    public List<TreeNode> children;

    public TreeNode() {
        children = new ArrayList<>();
    }

    public TreeNode(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public TreeNode(int _val, List<TreeNode> _children) {
        val = _val;
        children = _children;
    }
}

public class preOrderTraversal {
    public static List<Integer> preOrder(TreeNode root){        //   1
        List<Integer> res = new ArrayList<>();                 //  / | \
        if(root == null) return res;                          //  3  2  4
                                                             //  / \
        Stack<TreeNode> stack = new Stack<>();              //  5   6
        stack.push(root); //1

        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();//1
            res.add(curr.val); //1, 3, 5, 6, 2, 4

            for(int i = curr.children.size() - 1; i >= 0; i--){ 
                TreeNode child = curr.children.get(i);
                stack.push(child); //4, 2 -> 6, 5, 3
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.children.add(new TreeNode(3));
        root.children.add(new TreeNode(2));
        root.children.add(new TreeNode(4));
        root.children.get(0).children.add(new TreeNode(5));
        root.children.get(0).children.add(new TreeNode(6));
    
        List<Integer> result = preOrder(root);
        System.out.println(result); // Output: [1, 3, 5, 6, 2, 4]
    }
}