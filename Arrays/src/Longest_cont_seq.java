public class Longest_cont_seq {
    static void main(String[] args) {
        int count=1;
        int[] arr={ 3,9, 7, 2, 5, 8, 4, 6, 0,1, 1};
        for (int i = 0; i < arr.length; i++) {
            int current=arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]-1==current){
                    count++;
                    current=arr[j];
                }
            }
        }
        System.out.println(count);
    }
}
