public class Triplets_sum_0 {
    static void main(String[] args) {
        int[] arr={1,0,-1,1,-1,0,2,0,-2};
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1 ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==0){
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                        break;
                    }

                }

            }

        }
    }
}
