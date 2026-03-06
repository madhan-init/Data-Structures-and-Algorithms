public class Greater_neigh {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 2};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println(arr[i]);
                }
            }
            else if (i == n - 1) {
                if (arr[i] > arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }
            else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}