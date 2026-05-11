import java.util.*;

public class PrimsAlgorithm {

    static class Pair {
        int vertex;
        int weight;

        Pair(int v, int w) {
            vertex = v;
            weight = w;
        }
    }

    public static void prims(ArrayList<ArrayList<Pair>> graph, int V) {

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> a.weight - b.weight);

        boolean[] visited = new boolean[V];

        pq.add(new Pair(0, 0));

        int mstCost = 0;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            int u = current.vertex;
            int wt = current.weight;

            if (visited[u])
                continue;

            visited[u] = true;

            mstCost += wt;

            System.out.println("Visited Node: " + u +
                    " Weight: " + wt);

            for (Pair neighbor : graph.get(u)) {

                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (!visited[v]) {
                    pq.add(new Pair(v, weight));
                }
            }
        }

        System.out.println("Minimum Cost of MST = " + mstCost);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter source destination weight:");

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }

        prims(graph, V);
    }
}