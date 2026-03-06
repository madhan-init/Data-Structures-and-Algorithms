public class count_no_great_Avg {
    static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int avg=sum/ (arr.length-1);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(avg>arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
