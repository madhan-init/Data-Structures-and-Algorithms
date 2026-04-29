import java.util.*;

/*
Topological Sorting using Kahn's Algorithm (BFS)

Input Format:
n m
u1 v1
u2 v2
...
um vm

Where:
n = number of vertices
m = number of directed edges
u -> v means edge from u to v

Example Input:
6 6
5 2
5 0
4 0
4 1
2 3
3 1
*/

public class TopologicalSort {

    public static void topologicalSort(int n, ArrayList<ArrayList<Integer>> graph) {
        int[] indegree = new int[n];

        // Calculate indegree of each node
        for (int i = 0; i < n; i++) {
            for (int neighbor : graph.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add all nodes with indegree 0
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int neighbor : graph.get(node)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If result size != n, graph has cycle
        if (result.size() != n) {
            System.out.println("Topological sorting not possible (Graph has cycle)");
            return;
        }

        System.out.println("Topological Order:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices and edges
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Input edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v); // Directed edge u -> v
        }

        topologicalSort(n, graph);
    }
}