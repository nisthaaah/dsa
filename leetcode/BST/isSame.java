package leetcode.BST;


public class isSame {
    Node root;

    static class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public static boolean isSameTree(Node p, Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null || p.value!=q.value) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
    }

    public static void main(String[] args){
        isSame s = new isSame();

        Node pRoot = new Node(1);
        pRoot.left = new Node(2);
        pRoot.right = new Node(3);

        Node qRoot = new Node(1);
        qRoot.left = new Node(2);
        qRoot.right = new Node(3);
        
        System.out.println("Are the trees the same?\n" +s.isSameTree(pRoot, qRoot));

    }
    
}
