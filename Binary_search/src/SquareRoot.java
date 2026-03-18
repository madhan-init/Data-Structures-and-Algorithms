public class SquareRoot {

    public static int sqrt(int x) {
        if (x == 0 || x == 1) return x;

        int low = 1, high = x, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Avoid overflow using long
            long square = (long) mid * mid;

            if (square <= x) {
                ans = mid;        // possible answer
                low = mid + 1;    // try bigger
            } else {
                high = mid - 1;   // reduce
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 28;
        System.out.println(sqrt(x));
    }
}