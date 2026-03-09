public class Long_sub_sum {
    static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,6,1,1,1,1,1,1,1,1,1,1};
        int l=0;
        int maxlen=0;
        int sum=0;
        int tar=10;
        for (int r = 0; r < arr.length; r++) {
            sum=sum+arr[r];
            while (sum>tar){
                sum=sum-arr[l];
                l++;
            }
            if(sum==tar){
                maxlen=Math.max(maxlen,r-l+1);
            }
        }
        System.out.println(maxlen);
    }
}
