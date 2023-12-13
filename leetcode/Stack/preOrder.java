package leetcode.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preOrder {
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

    public List<Integer> preOrder(Node root){
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        stack.add(root);
        while(!stack.isEmpty()){
            Node currNode = stack.peek();
            stack.pop();

            if(currNode!= null){
                result.add(currNode.value);
                stack.add(currNode.right);
                stack.add(currNode.left);
            }
        }
        return result ;
    }
    public static void main(String[] args){
        preOrder p = new preOrder();
        p.insert(1);
        p.insert(0);
        p.insert(2);
        p.insert(3);
        //p.insert(47);
        System.out.println("Pre-Order Traversal is: " +p.preOrder(p.root));
    }
}
