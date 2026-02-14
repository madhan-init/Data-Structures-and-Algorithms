import java.util.HashMap;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);}
        int maxCount = 0;
        int mostFrequent = arr[0];
        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mostFrequent = key;
            }}
        System.out.println("Most Frequent Element: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);
    }
}
