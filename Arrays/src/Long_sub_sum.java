public class Long_sub_sum {
    static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,6,1,1,1,1,1,1,1,1,1,1};
        int sum=0;
        int target=9;
        int l=0;
        int max=0;
        for (int r = 0; r < arr.length; r++) {
            sum=sum+arr[r];
            while (sum>target){
                sum=sum-arr[l];
                l++;
            }
            if(sum==target){
                 max=Math.max(max,r-l+1);
            }
        }
        System.out.println(max);
    }
}
