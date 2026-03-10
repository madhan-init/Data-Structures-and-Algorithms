public class Buy_and_sell_stock {
    static void main(String[] args) {
        int[] prices={17,12,5,10,54};
        int right=0;
        int left=0;
        int maxProfit=0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                left = right;
            }
            right++; // Always move the selling pointer forward
        }
        System.out.println(maxProfit);
    }
}
