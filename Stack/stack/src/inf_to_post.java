import java.util.Stack;
public class inf_to_post {
    static void main(String[] args) {
        String s="(A+B)*(A-C)";
        inftopost(s);
    }
    public static void inftopost(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        int i=0;
        Stack<Character> st=new Stack<>();
        while (i<s.length()){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            } else if (c=='(') {
                st.push(c);
            } else if (c==')') {
                while (st.peek()!='('){
                    stringBuilder.append(st.pop());
                }
                st.pop();
            }else{
                while (!st.isEmpty() && prec(c)<=prec(st.peek())){
                    stringBuilder.append(st.pop());
                }
                st.push(c);
            }
            i++;
        }while (!st.isEmpty()) {
            stringBuilder.append(st.pop());
        }
        System.out.println(stringBuilder.toString());
    }

    private static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
}
