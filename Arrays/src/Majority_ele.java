public class Majority_ele {
    static void main(String[] args) {
        int[] arr={5,3,3,1,1,3,3,3,2};
        int l=1;
        int count=0;
        int max=0;
        int ele=0;
        for (int r = 0; r < arr.length; r++) {
            if(arr[r]==arr[l]){
                count++;
            }
            if(count>max){
                ele=arr[r];
                max=count;
            }
        }
        if(count> arr.length/2){
        System.out.println(ele);
            System.out.println(max);}
    }
}
