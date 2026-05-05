import java.util.*;

public class TopologicalSortDFS {

    static void dfs(int node, boolean[] visited, Stack<Integer> stack, List<List<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, stack, adj);
            }
        }

        // push after visiting all neighbors
        stack.push(node);
    }

    static void topologicalSort(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // call DFS for all components
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, stack, adj);
            }
        }

        // print result
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int V = 6;

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Directed edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        topologicalSort(V, adj);
    }
}