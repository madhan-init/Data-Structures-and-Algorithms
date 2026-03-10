import java.util.Arrays;
public class Alternate_sign {
    static void main(String[] args) {
        int[] arr={3,-2,5,6,12,-3,-1,-4};
        int neg=1;
        int pos=0;
        int[] res=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                res[pos]=arr[i];
                pos+=2;
            }
            else{
                res[neg]=arr[i];
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
