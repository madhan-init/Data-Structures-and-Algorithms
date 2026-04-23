import java.util.*;

public class KClosestNumbers {

    public static List<Integer> findClosest(int[] arr, int k, int x) {

        // Max Heap based on distance
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        for (int num : arr) {

            int diff = Math.abs(num - x);

            // Optional: skip if num == x
            if (num == x) continue;

            pq.offer(new int[]{diff, num});

            if (pq.size() > k) {
                pq.poll(); // remove farthest
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll()[1]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Enter target x: ");
        int x = sc.nextInt();

        List<Integer> result = findClosest(arr, k, x);

        System.out.println("K Closest Numbers:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}