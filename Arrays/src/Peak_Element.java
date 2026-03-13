import java.util.Scanner;

public class Peak_Element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;

        while(low < high){
            int mid = (low + high) / 2;

            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Peak element: " + arr[low]);
        System.out.println("Index: " + low);
    }
}