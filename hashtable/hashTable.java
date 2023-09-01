package hashtable;

import java.util.ArrayList;

public class hashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key=key;
            this.value=value;
        }
    }

    public hashTable(){
        dataMap = new Node[size];
        }

    public void printTable() {
        for(int i=0; i<dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp!= null){
                System.out.println(" { " +temp.key+ "=" +temp.value+ " } ");
                temp=temp.next;
            }
        }
    }

    public void set(String key, int value) {
        int index = key.hashCode() % size;
        Node newNode = new Node(key, value);
    
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } 
        else {
            Node temp = dataMap[index];
            while (temp.next != null) { 
            temp = temp.next;
        }
          temp.next = newNode;
        }
    }         
    

    public int get(String key){
        int index = key.hashCode() % size;
        Node temp = dataMap[index];
        while(temp!=null){
            if(temp.key == key) return temp.value;
            temp=temp.next;
        }
        return 0;
    }
    public ArrayList keys(){
        ArrayList<String> keys = new ArrayList<>();
        for(int i=0; i<dataMap.length; i++){
            Node temp = dataMap[i];
            while (temp!=null) {
                keys.add(temp.key);
                temp=temp.next;    
            }
        }
        return keys;
    }
}
