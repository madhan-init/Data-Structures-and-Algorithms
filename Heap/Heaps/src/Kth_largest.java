import java.util.Arrays;
import java.util.PriorityQueue;
public class Kth_largest {
    public static void main(String[] args) {
    int[] nums={1,2,3,4,5,6};  
    int k=4;
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    System.out.println(Arrays.toString(nums));
    for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); 
            }
        }
        System.out.println(pq.peek());
    }
}


