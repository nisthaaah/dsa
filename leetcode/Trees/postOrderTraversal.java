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

public class postOrderTraversal {
    public static List<Integer> postOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stack = new Stack<>();           //   1
        stack.push(root);                               //  / | \
                                                       //  3  2  4
        while(!stack.isEmpty()){                      //  / \
            TreeNode curr = stack.pop();             //  5   6
            res.add(curr.val); //1, 4, 2, 3, 6, 5

            for(TreeNode child : curr.children){
                stack.push(child); //5, 6, 3, 2, 4(top)
            }
        }
        Collections.reverse(res); //5, 6, 3, 2, 4, 1
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.children.add(new TreeNode(3));
        root.children.add(new TreeNode(2));
        root.children.add(new TreeNode(4));
        root.children.get(0).children.add(new TreeNode(5));
        root.children.get(0).children.add(new TreeNode(6));
    
        List<Integer> result = postOrder(root);
        System.out.println(result); 
    }
}
