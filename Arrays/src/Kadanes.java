public class Kadanes
{
    static void main(String[] args) {
        int sum=0;
        int max_sub=0;
        int[] arr={2,3,5,-2,7,-4};
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum>max_sub){
                max_sub=sum;    }

            if(sum<0){
                sum=0;
            }}
        System.out.println(max_sub);
    }
}
