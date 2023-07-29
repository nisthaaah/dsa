package recursiveBST;

public class Main6 {
    public static void main(String[] args) {
        rBST rec=new rBST();

        rec.rInsert(89);
        rec.rInsert(79);
        rec.rInsert(59);
        rec.rInsert(40);
        rec.rInsert(90);

        // System.out.println(rec.rContains(0));
        // System.out.println(rec.rContains(90));
        System.out.println(rec.root.left.value);



    }
    
}
