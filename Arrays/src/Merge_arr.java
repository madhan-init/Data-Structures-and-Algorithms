public class Merge_arr {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={8,9,10};
        int [] arr3=new int [arr.length+ arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i]=arr[i];
        }
        int j=0;
        for (int i = arr.length; i < arr3.length; i++) {
            arr3[i]=arr2[j];
            j++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);

        }
    }
}
