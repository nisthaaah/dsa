package leetcode.BST;

public class sortedArrayToBST {
    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value +" ");
        printTree(root.left);
        printTree(root.right);
    }

    public Node toBST(int[] arr){
        return sortedArray(arr, 0, arr.length - 1);
    }

    public Node sortedArray(int[] arr, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left)/2;

        Node root = new Node(arr[mid]);
        root.left = sortedArray(arr, left, mid - 1);
        root.right = sortedArray(arr, mid+1, right);
        return root;
    }
    public static void main(String[] args){
        sortedArrayToBST s = new sortedArrayToBST();
        int[] arr = {-10,-3,0,5,9};
        Node root = s.toBST(arr);
        
        s.printTree(root);
    }    
}
