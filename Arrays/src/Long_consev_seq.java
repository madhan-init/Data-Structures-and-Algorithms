public class Long_consev_seq {
    static void main(String[] args) {
        int[] arr={2,1,3,4,10,5,0};
        int maxcount=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]+1){
                    arr[i]=arr[i]+1;
                    count++;
                }
                if(count>maxcount){
                    maxcount=count;
                }
            }
        }
        System.out.println(maxcount);
    }
}
