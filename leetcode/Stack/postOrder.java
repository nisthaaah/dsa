package leetcode.Stack;
import java.util.*;

import javax.swing.tree.TreeNode;

public class postOrder {
    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root==null){
            root=newNode;
            return true;
        }
            Node temp=root;
            while(true){
                if(newNode.value == temp.value) return false;
                if(newNode.value < temp.value){
                    if(temp.left == null){
                        temp.left = newNode;
                        return true;
                    }
                    else  temp = temp.left ;
                }
                else{
                    if (temp.right == null) {
                        temp.right = newNode;
                        return true;
                    }
                    else  temp = temp.right ;
                }
                }
            }

    public List<Integer> postOrder(Node root){
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack  = new Stack<>();

        stack.add(root); // 1
        while(!stack.isEmpty()){
            Node currNode = stack.pop(); // 1
            if(currNode!=null){
            result.add(0, currNode.value); //inserts the given value at index 0 of the result list, effectively shifting all existing elements to the right.
            stack.add(currNode.left); // 0
            stack.add(currNode.right); // 2 || 3
        } //[0, 3, 2, 1]
    }
        return result;
    }
    public static void main(String[] args){
        postOrder p = new postOrder();
        p.insert(1);
        p.insert(0);
        p.insert(2);
        p.insert(3);
        //p.insert(47);
        System.out.println("Post-Order Traversal is: " +p.postOrder(p.root));
    }

}
