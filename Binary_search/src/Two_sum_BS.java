import java.util.*;

public class Two_sum_BS {
    static int binarySearch(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int target = sc.nextInt();

        for(int i=0;i<n;i++){
            int idx = binarySearch(arr, i+1, n-1, target-arr[i]);
            if(idx!=-1){
                System.out.println(arr[i]+" "+arr[idx]);
                return;
            }
        }
        System.out.println("Not Found");
    }
}