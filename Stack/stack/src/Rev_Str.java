import java.util.*;

public class Rev_Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Output
        System.out.println(reversed);
    }
}