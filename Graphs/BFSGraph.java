import java.util.*;

public class BFSGraph {

    public static void bfs(int start, ArrayList<ArrayList<Integer>> graph, int V) {
        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected Graph
        graph.get(0).add(1);
        graph.get(0).add(3);

        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(1).add(4);

        graph.get(2).add(1);

        graph.get(3).add(0);
        graph.get(3).add(4);

        graph.get(4).add(1);
        graph.get(4).add(3);

        System.out.println("BFS Traversal:");

        bfs(0, graph, V);
    }
}