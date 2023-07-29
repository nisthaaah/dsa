package recursiveBST;

public class rBST {
    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }
    private Node rInsert(Node currNode, int value){
        if(currNode == null) return new Node(value);
        if(value < currNode.value){
            currNode.left=rInsert(currNode.left, value);
        }
        else{
            currNode.right=rInsert(currNode.right, value);
        }
        return currNode;
    }
    public void rInsert(int value){
         if(root==null) root=new Node(value);
        rInsert(root, value);
    }
    
    private boolean rContains(Node currNode, int value){
        if (currNode == null) return false;
        if(currNode.value == value) return true;
        if(value < currNode.value){
            return rContains(currNode.left, value);
        }
        else{
            return rContains(currNode.right, value);
        }
    }
    public boolean rContains(int value){
    return rContains(root, value);
    }
    
}
