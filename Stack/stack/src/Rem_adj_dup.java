import java.util.Scanner;
import java.util.Stack;

public class Rem_adj_dup {
    static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (char ch : s.toCharArray()) {
            if(!st.isEmpty() &&st.peek()==ch){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : st) {
            res.append(c);
        }
        System.out.println(res);
    }
}
