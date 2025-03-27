package CollectionFrameworks.Graphs;

import java.util.LinkedList;
import java.util.Scanner;

class Graph2{
    private LinkedList<Integer>[] adj;
    private boolean isDirected;

    public Graph2(int v, boolean isDirected) {
        adj = new LinkedList[v];
        this.isDirected = isDirected;
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        if (!isDirected) { // If the graph is undirected, add the reverse edge
            adj[destination].add(source);
        }
    }
    public void printGraph(){

        System.out.println("Graph Representation (Adjacency List) : ");
        for(int i = 0; i < adj.length; i++)
        {
            System.out.print(i + "--> ");
            for(int node : adj[i])
            {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
public class DirectedImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("Is the graph directed? (true for directed, false for undirected):");
        boolean isDirected = sc.nextBoolean();

        Graph2 graph = new Graph2(v, isDirected);

        System.out.println("Enter " + e + " edges:");
        for (int i = 0; i < e; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            if (source < 0 || source >= v || destination < 0 || destination >= v) {
                System.out.println("Invalid edge: (" + source + ", " + destination + ")");
                sc.close();
                return;
            }
            graph.addEdge(source, destination);
        }

        graph.printGraph();
        sc.close();
    }
}
