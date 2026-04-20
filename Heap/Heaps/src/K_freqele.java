import java.util.*;
public class K_freqele {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Frequency count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap (based on frequency)
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Step 3: Maintain size k
        for (int key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // Step 4: Extract result
        int[] res = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            res[i] = pq.poll();
            i++;
        }

        System.out.println(Arrays.toString(res));
    }
}
