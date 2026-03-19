public class NthRoot {

    // function to calculate mid^n safely
    public static long power(long base, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= base;

            // early stopping (to avoid overflow)
            if (result > Long.MAX_VALUE / base) {
                return Long.MAX_VALUE;
            }
        }
        return result;
    }

    public static int nthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = (low + high) / 2;
            long val = power(mid, n);

            if (val == m) return mid;

            else if (val < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // no integer root
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;

        int ans = nthRoot(n, m);
        System.out.println(ans);
    }
}