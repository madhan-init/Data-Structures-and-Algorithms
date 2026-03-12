import java.util.Arrays;

public class Longest_seq {
    static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,10,11,12,13,14,15,16};
        int last_small=Integer.MIN_VALUE;
        int longest=0;
        Arrays.sort(arr);
        int curr=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]-1==last_small){
                curr++;
                last_small=arr[i];
            } else if (arr[i]!=last_small) {
                curr=1;
                last_small=arr[i];

            }
            longest=Math.max(longest,curr);

        }
        System.out.println(longest);
    }
}



//import java.util.HashSet;
//import java.util.Set;
//
//public class Solution {
//    public int longestConsecutive(int[] nums) {
//        if (nums.length == 0) return 0;
//
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//
//        int longestStreak = 0;
//
//        for (int num : set) {
//            // Check if 'num' is the start of a sequence
//            if (!set.contains(num - 1)) {
//                int currentNum = num;
//                int currentStreak = 1;
//
//                // Build the sequence
//                while (set.contains(currentNum + 1)) {
//                    currentNum += 1;
//                    currentStreak += 1;
//                }
//
//                longestStreak = Math.max(longestStreak, currentStreak);
//            }
//        }
//
//        return longestStreak;
//    }
//}
