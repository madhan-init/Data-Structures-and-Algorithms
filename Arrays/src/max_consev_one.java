public class max_consev_one {
    static void main(String[] args) {
        int[] arr={1,1,0,0,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int maxone=0;
        int ones=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                ones++;
            }
            if(arr[i]==0){
                ones=0;
            }
            if(ones>maxone){
                maxone=ones;
            }
        }
        System.out.println(maxone);
    }
}
