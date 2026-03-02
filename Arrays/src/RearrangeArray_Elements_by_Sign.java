public class RearrangeArray_Elements_by_Sign {
    static void main(String[] args) {
        int[] arr={1,-1,2,3,-2};
int[] res=new int[arr.length];
int pos=0;
int neg=1;
        for (int i = 0; i < arr.length; i++) {

         if(arr[i]>=0){
             res[pos]=arr[i];
             pos+=2;
         }
        else {
            res[neg]=arr[i];
            neg+=2;
         }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i]);

        }
    }
}
