import java.util.Arrays;

public class Move_zeros {

        static void main(String[] args) {
            int[] arr={0,2,0,0,3,4,5,0,1,2};
            int j=0;
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i]==0){
                    j=i;
                    break;
                }
            }
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;}


            }
            System.out.println(Arrays.toString(arr));
        }
    }

