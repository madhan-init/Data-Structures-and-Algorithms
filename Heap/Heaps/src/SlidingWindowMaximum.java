import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();
        int j = 0;

        for (int i = 0; i < n; i++) {

            // 1. Remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Store result
            if (i >= k - 1) {
                result[j++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input window size
        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        int[] result = maxSlidingWindow(nums, k);

        // Output result
        System.out.println("Sliding Window Maximum:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}