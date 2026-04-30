import java.util.*;

class Pair {
    int node, dist;

    Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

public class dijkstras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt(); // number of vertices
        int E = sc.nextInt(); // number of edges

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        // initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // input edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w)); // remove if directed
        }

        int source = sc.nextInt();

        dijkstra(V, adj, source);
    }

    public static void dijkstra(int V, ArrayList<ArrayList<Pair>> adj, int src) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int node = cur.node;
            int d = cur.dist;

            for (Pair it : adj.get(node)) {
                int adjNode = it.node;
                int weight = it.dist;

                if (d + weight < dist[adjNode]) {
                    dist[adjNode] = d + weight;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }

        // print result
        System.out.println("Shortest distances from source:");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " : " + dist[i]);
        }
    }
}