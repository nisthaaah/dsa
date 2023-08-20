package binarysearchtrees;

public class Main4 {
    public static void main(String[] args){
        BST myBST = new BST();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);
        System.out.println("Breadth First Search: " +myBST.BFS());
        //System.out.println(myBST.root.right.left.left.value);
        System.out.println("Depth First Search(Pre Order): " +myBST.DFSPreOrder());
        System.out.println("Depth First Search(Post Order): " +myBST.DFSPostOrder());
        System.out.println("Depth First Search(In Order): " +myBST.DFSInOrder());
        //System.out.println("Depth First Search(In Order): " +myBST.inOrder(myBST.root));


        


        //System.out.println(myBST.root.left.value);
        //System.out.println(myBST.contains(0));
        //System.out.println(myBST.contains(9));
    }
}
