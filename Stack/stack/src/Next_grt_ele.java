import java.util.Arrays;
import java.util.Stack;
public class Next_grt_ele {
    static void main(String[] args) {
        int[] arr1={4,1,2};
        int[] arr2={1,3,4,2};
        int[] res=new int[arr1.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr1.length; i++) {
            if(!st.isEmpty() && st.peek()<arr1[i]){
                st.push(arr1[i]);
            }
            else {
                st.push(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!st.isEmpty() && arr2[i]>st.peek()){
                res[i]=arr2[2];
            }else {
                res[i]=-1;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
