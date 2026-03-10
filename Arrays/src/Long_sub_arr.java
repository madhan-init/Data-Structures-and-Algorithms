public class Long_sub_arr {
    static void main(String[] args) {
        int l=0;
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int sum=0;
        int k=9;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            while (sum>k){
                sum=sum-arr[l];
                l++;
            }if(sum==k){
                int curr=i-l+1;
                if(curr>max){
                    max=curr;
                }
            }

        }
        System.out.println(max);
    }
}
