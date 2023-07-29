package binarysearchtrees;

public class Main4 {
    public static void main(String[] args){
        BST myBST = new BST();
        myBST.insert(9);
        myBST.insert(-5);
        myBST.insert(123);
        myBST.insert(4);
        


        //System.out.println(myBST.root.left.value);
        System.out.println(myBST.contains(0));
        System.out.println(myBST.contains(9));
    }
}
