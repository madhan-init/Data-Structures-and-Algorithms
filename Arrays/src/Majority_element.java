public class Majority_element {
    static void main(String[] args) {
        int [] arr={3,3,4,4};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count> arr.length/2){
                System.out.println("element found"+" "+arr[i]);
                return;
            }
        }
        System.out.println("no");


    }
}
