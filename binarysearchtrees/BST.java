package binarysearchtrees;
import java.util.*;

public class BST {
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

                public boolean contains(int value){
                    //if(root == null) return false;
                    Node temp = root;
                    while(temp!= null ){
                        if(value < temp.value){
                            temp = temp.left;
                            }
                        else if(value > temp.value){
                                temp=temp.right;
                            }
                        else return true; //temp.value=value
                } 
                return false;
        }
        public int minValue(Node currNode){
            while(currNode.left != null){
                currNode = currNode.left;
            }
            
            return currNode.value;
        } 
        public ArrayList<Integer> BFS(){
            Node currNode = root;
            Queue queue = new LinkedList<>();
            ArrayList<Integer> results = new ArrayList<>();
            queue.add(currNode);

            while(queue.size() > 0){
                currNode = (Node) queue.remove();
                results.add(currNode.value);
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
            return results;
        } 

        public ArrayList<Integer> DFSPreOrder() {
            ArrayList<Integer> results = new ArrayList<>();
    
            class Traverse { //inner class
                Traverse(Node currNode) {
                    results.add(currNode.value);
                    if (currNode.left != null) {
                        new Traverse(currNode.left); 
                    }
                    if (currNode.right != null) {
                        new Traverse(currNode.right);
                    }
                }
            }
            new Traverse(root);
            return results;
        }

        public ArrayList<Integer> DFSPostOrder() {
            ArrayList<Integer> results = new ArrayList<>();
            
            class Traverse{
                Traverse(Node currNode){
                    if (currNode.left != null) {
                        new Traverse(currNode.left); 
                    }
                    if (currNode.right != null) {
                        new Traverse(currNode.right);
                    }
                    results.add(currNode.value);
                }
            }
            new Traverse(root);
            return results;
        }

        public ArrayList<Integer> DFSInOrder() {
            ArrayList<Integer> results = new ArrayList<>();
            class Traverse{
                Traverse(Node currNode){
                    if (currNode.left != null) {
                        new Traverse(currNode.left); 
                    }
                    results.add(currNode.value);

                    if (currNode.right != null) {
                        new Traverse(currNode.right);
                    }
                }
            }
            new Traverse(root);
            return results;
        }

        public List<Integer> inOrder(Node root){
            List<Integer> result = new ArrayList<>();
            helper(root, result);
            return result;
         }
        public void helper(Node root, List<Integer> result){
            if(root!= null){
                helper(root.left, result);
                result.add(root.value);
                helper(root.right, result);
            }
         }
    }


