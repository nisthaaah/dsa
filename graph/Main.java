package graph;

public class Main {
    public static void main(String[] args){
        Graph myGraph = new Graph();
        myGraph.addVertex("1");
        myGraph.addVertex("2");
        myGraph.addVertex("3");
        myGraph.addVertex("4");

        myGraph.addEdge("1", "2");
        myGraph.addEdge("2", "3");
        myGraph.addEdge("1", "3");
        myGraph.addEdge("1", "4");

        System.out.println("Before removing the edge");
        myGraph.printGraph();
        System.out.println();

        // myGraph.removeEdge("1", "2");
        // System.out.println("After removing the edge");
        // myGraph.printGraph();

        myGraph.removeVertex("3");
        myGraph.printGraph();
    }
}