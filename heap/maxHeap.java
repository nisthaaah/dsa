package heap;
import java.util.*;

public class maxHeap {
    private List<Integer> heapList;

    public maxHeap(){
        this.heapList = new ArrayList<>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heapList); //return a copy of the heap elements as an ArrayList
    }

    private int parent(int index){
        return (index-1) / 2;
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private int rightChild(int index){
        return 2 * index + 2;
    }

    private void swap(int index1, int index2){
        int temp = heapList.get(index1);
        heapList.set(index1, heapList.get(index2));
        heapList.set(index2, temp);
    }

    public void insert(int value){
        heapList.add(value);
        int curr = heapList.size() - 1;
        
        while(curr > 0 && heapList.get(curr) > heapList.get(parent(curr))){
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }

    public Integer remove(){
        if(heapList.size() == 0){
            return null;
        }
        if(heapList.size() == 1){
            return heapList.remove(0);
        }
        int maxValue = heapList.get(0);
        heapList.set(0, heapList.remove(heapList.size() -1 ));
        sinkDown(0);

        return maxValue;
    }

    public void sinkDown(int index){
        int maxIndex = index;
        while(true){
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if(leftIndex < heapList.size() && heapList.get(leftIndex) > heapList.get(maxIndex)){
                maxIndex = leftIndex;
            }
            if(rightIndex < heapList.size() && heapList.get(rightIndex) > heapList.get(maxIndex)){
                maxIndex = rightIndex;
            }
            if(maxIndex != index){
                swap(index, maxIndex);
                index = maxIndex;
            }
            else return;
        }
    }

}
