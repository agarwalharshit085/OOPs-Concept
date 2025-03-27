package CollectionFrameworks.Graphs;
import java.util.*;

// Using Priority Queue
class DijikstraAlgorithm {
    public int[] shortestPath(int n, int[][] roads, int source) {
        // Step 1: Create Graph (Adjacency List)
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] road : roads) {
            int u = road[0], v = road[1], time = road[2];
            graph.get(u).add(new int[]{v, time});
            graph.get(v).add(new int[]{u, time}); // Undirected graph
        }

        // Step 2: Initialize Distance Array and Min-Heap
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0; // Distance to source is 0

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, source}); // {distance, node}

        // Step 3: Dijkstra's Algorithm
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], u = curr[1];

            if (d > dist[u]) continue; // Ignore outdated distances

            for (int[] neighbor : graph.get(u)) {
                int v = neighbor[0], weight = neighbor[1];
                int newDist = d + weight;

                if (newDist < dist[v]) { // Found a shorter path
                    dist[v] = newDist;
                    pq.offer(new int[]{newDist, v});
                }
            }
        }

        return dist; // Shortest distances from source to all nodes
    }

    public static void main(String[] args) {
        DijikstraAlgorithm dijkstra = new DijikstraAlgorithm();
        int n = 5;
        int[][] roads = {
                {0, 1, 10}, {0, 2, 3}, {1, 2, 1}, {1, 3, 2}, {2, 3, 8}, {3, 4, 4}
        };
        int source = 0;

        int[] shortestPaths = dijkstra.shortestPath(n, roads, source);
        System.out.println(Arrays.toString(shortestPaths)); // Output: Shortest distances
    }
}
