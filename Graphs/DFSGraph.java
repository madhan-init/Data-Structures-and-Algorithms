import java.util.*;

public class DFSGraph {

    public static void dfs(int start, ArrayList<ArrayList<Integer>> graph, int V) {
        boolean[] visited = new boolean[V];

        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                // Push neighbors in reverse order
                for (int i = graph.get(node).size() - 1; i >= 0; i--) {
                    int neighbor = graph.get(node).get(i);

                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
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

        // Edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        /*
              0
             / \
            1   2
           / \
          3   4
        */

        dfs(0, graph, V);
    }
}