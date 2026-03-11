import java.util.Arrays;

public class Longest_seq {
    static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,10,11,12,13,14,15,16};
        int last_small=Integer.MIN_VALUE;
        int longest=0;
        Arrays.sort(arr);
        int curr=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]-1==last_small){
                curr++;
                last_small=arr[i];
            } else if (arr[i]!=last_small) {
                curr=1;
                last_small=arr[i];

            }
            longest=Math.max(longest,curr);

        }
        System.out.println(longest);
    }
}
