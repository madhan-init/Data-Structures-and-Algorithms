import java.util.HashMap;

public class K {
    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int K = 33;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == K) {
                System.out.println("Subarray found (0 to " + i + ")");
                return;
            }
            if (map.containsKey(sum - K)) {
                System.out.println("Subarray found (" + (map.get(sum - K) + 1) + " to " + i + ")");
                return;
            }
            map.put(sum, i);
        }
        System.out.println("No subarray found");
    }
}
