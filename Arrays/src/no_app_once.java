public class no_app_once {
    static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum^arr[i];
        }
        System.out.println(sum);
    }
}
