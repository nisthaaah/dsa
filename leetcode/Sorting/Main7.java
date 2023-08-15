package leetcode.Sorting;
public class Main7 {
    public static void main(String[] args) {

        bSort ll1= new bSort(4);
        sSort ll2 = new sSort(6);
        iSort ll3 = new iSort(7);
        ll3.append(2);
        ll3.append(6);
        ll3.append(5);
        ll3.append(1);
        ll3.append(3);

        System.out.println("Unsorted Linked List:");
        ll3.printList();

        //ll1.bubbleSort();
        //ll2.selectionSort();
        ll3.insertionSort();

        System.out.println("\nSorted Linked List:");
        ll3.printList();
    }

}
