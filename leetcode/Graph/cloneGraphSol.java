package leetcode.Graph;
import java.util.*;

class Node {
    public int value;
    public List<Node> neighbors;
    public Node() {
        value = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _value) {
        value = _value;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _value, ArrayList<Node> _neighbors) {
        value = _value;
        neighbors = _neighbors;
    }
}
public class cloneGraphSol {
        Map<Node, Node> visited = new HashMap<>();

        public Node cloneGraph(Node node){  // 1 --- 2
                                           //  |     |
        if(node == null) return null;     //   4 --- 3

        Node newNode = new Node(node.value); //1
        visited.put(node, newNode); //(1, 1), (2, 2), (4, 4)

        for(Node neighbor : node.neighbors){
            if(!visited.containsKey(neighbor)){ //
                newNode.neighbors.add(cloneGraph(neighbor)); //2, 4
            }
            else{
                newNode.neighbors.add(visited.get(neighbor));
            }
        }
        return newNode;
    }

    public static void main(String[] args){
        //original graph
        Node node1 = new Node(1); 
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node cloned = new cloneGraphSol().cloneGraph(node1);

        System.out.print("Cloned Node 1 Neighbors: ");
        for (Node neighbor : cloned.neighbors) {
            System.out.print(neighbor.value + " ");
        }
    }
}
