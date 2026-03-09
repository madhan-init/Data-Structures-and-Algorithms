public class Missing_n_number {
    static void main(String[] args) {
        int [] arr={1,2,3,5};
        int n= 5;
        int sum=0;
        int s2= (n*(n+1))/2;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(s2-sum);


    }
}
