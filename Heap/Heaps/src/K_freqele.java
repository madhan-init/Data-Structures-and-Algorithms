
import java.util.HashMap;
import java.util.PriorityQueue;

public class K_freqele {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
   PriorityQueue<Integer> pq=new PriorityQueue<>(
    (a,b)-> map.get(b)-map.get(a)
   );
   int k=2;
   pq.addAll(map.keySet());
   for(int i:pq){
    if(pq.size()>k){
        pq.poll();
    }
    System.out.println(pq.peek());
    return;
   }
//    System.out.println(pq.peek());

    }
}
