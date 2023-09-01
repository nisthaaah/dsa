package hashtable;

public class Main {
    public static void main(String[] args){
        hashTable h = new hashTable();

        h.set("a" , 7);
        h.set("b" , 8);
        h.set("b", 5);
        //System.out.println(h.get("a")); 
        h.printTable();
        System.out.println(h.keys());
    }
    
}
