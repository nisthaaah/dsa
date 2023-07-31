package recursiveBST;

public class Main6 {
    public static void main(String[] args) {
        rBST rec=new rBST();

        rec.rInsert(47);
        rec.rInsert(21);
        rec.rInsert(76);
        rec.rInsert(18);
        rec.rInsert(27);
        rec.rInsert(52);
        rec.rInsert(82);
        rec.rInsert(50);
        rec.rInsert(54);
        rec.rInsert(24);
        rec.rInsert(29);
        rec.deleteNode(76);
        

        //System.out.println("The BST contains the value: " +rec.rContains(0));
        //System.out.println("The BST contains the value: " +rec.rContains(90));
        System.out.println("The root of the BST: " +rec.root.right.value);
        //System.out.println("Minimum value: " +rec.minValue(rec.root));
        System.out.println("Minimum value: " +rec.minValue(rec.root.right));
    }
    
}
