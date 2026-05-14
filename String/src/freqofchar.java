import java.util.HashMap;

public class freqofchar {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("Character Frequencies:");
        
        for (char ch : map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }
    }
}