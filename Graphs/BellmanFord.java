import java.util.*;

public class BellmanFord {

    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    public static void bellmanFord(List<Edge> edges, int V, int source) {

        int[] dist = new int[V];

        // Step 1: Initialize distances
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        // Step 2: Relax all edges V-1 times
        for (int i = 1; i < V; i++) {

            for (Edge edge : edges) {

                int u = edge.src;
                int v = edge.dest;
                int wt = edge.weight;

                if (dist[u] != Integer.MAX_VALUE &&
                        dist[u] + wt < dist[v]) {

                    dist[v] = dist[u] + wt;
                }
            }
        }

        // Step 3: Detect negative cycle
        for (Edge edge : edges) {

            int u = edge.src;
            int v = edge.dest;
            int wt = edge.weight;

            if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + wt < dist[v]) {

                System.out.println("Negative Weight Cycle Detected");
                return;
            }
        }

        // Print shortest distances
        System.out.println("Vertex\tDistance from Source");

        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        List<Edge> edges = new ArrayList<>();

        System.out.println("Enter source destination weight:");

        for (int i = 0; i < E; i++) {

            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();

            edges.add(new Edge(src, dest, weight));
        }

        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();

        bellmanFord(edges, V, source);
    }
}