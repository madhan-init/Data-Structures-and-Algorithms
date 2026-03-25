import java.util.Arrays;
public class Next_permu {
    static void main(String[] args) {
        int[] arr={1,2,3};
        int i=arr.length-2;
        while (i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
        int j= arr.length-1;
        while (arr[j]<=arr[i]){
            j--;
        }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;}

        System.out.println(Arrays.toString(rev(arr,i+1,arr.length-1)));
    }

    public static int[] rev(int[] arr, int l, int r) {
        while (l<r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;}
        return arr;
    }
}
