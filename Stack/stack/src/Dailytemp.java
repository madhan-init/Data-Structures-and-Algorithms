import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;
public class Dailytemp {
    static void main(String[] args) {
        int[] temp={73,74,75,71,69,72,76,73};
        int[] ans=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < temp.length ; i++) {
            while (!st.isEmpty()&& temp[i]>temp[st.peek()]){
                int prev=st.pop();
                ans[prev]=i-prev;
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
