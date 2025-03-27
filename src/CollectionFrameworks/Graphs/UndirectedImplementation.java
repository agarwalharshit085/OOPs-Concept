package CollectionFrameworks.Graphs;

import java.util.LinkedList;
import java.util.Scanner;

class Graph1{
    private LinkedList<Integer>[] adj;
    public Graph1(int v)
    {
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source , int destination){

        adj[source].add(destination);
        adj[destination].add(source);
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
public class UndirectedImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges :");
        int v = sc.nextInt();
        int e = sc.nextInt();

        Graph1 graph = new Graph1(v);

        System.out.println("Enter " + e + " edges :");
        for(int i = 0; i < e; i++)
        {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            if (source < 0 || source >= v || destination < 0 || destination >= v) {
                System.out.println("Invalid edge: (" + source + ", " + destination + ")");
                return;
            }
            graph.addEdge(source, destination);
        }
        graph.printGraph();
    }
}
