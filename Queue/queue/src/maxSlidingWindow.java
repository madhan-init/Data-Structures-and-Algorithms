import java.util.*;

public class maxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            // 1. Remove elements out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements (useless)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Store result
            if (i >= k - 1) {
                res[idx++] = nums[dq.peekFirst()];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] ans = maxSlidingWindow(nums, k);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}