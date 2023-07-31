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
            currNode.left = rInsert(currNode.left, value);
        }
        else if(value > currNode.value){
            currNode.right = rInsert(currNode.right, value);
        }
        return currNode;
    }
    public void rInsert(int value){
        if(root==null) root = new Node(value);
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

    private Node deleteNode(Node currNode, int value){
        if(currNode == null) return null;
        if(value < currNode.value){
            currNode.left = deleteNode(currNode.left, value);
        }
        else if (value > currNode.value){
            currNode.right = deleteNode(currNode.right, value);
        }
        else{
            if(currNode.left == null && currNode.right == null) return null;
            else if(currNode.left == null){ // 1 child on right side
                currNode = currNode.right;
            }
            else if(currNode.right == null){ // 1 child on left side
                currNode = currNode.left;
            }
            else{
                int subTreeMin = minValue(currNode.right);
                currNode.value = subTreeMin;
                currNode.right = deleteNode(currNode.right,subTreeMin );
            }
        }
        return currNode;
    }

    public void deleteNode(int value){
        deleteNode(root, value);
    }

    public int minValue(Node currNode){
        while(currNode.left != null){
            currNode = currNode.left;
        }
        return currNode.value;
    }  
    
}
