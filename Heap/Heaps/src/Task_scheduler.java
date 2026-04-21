import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public class Task_scheduler {
    public static void main(String[] args) {
        char[] tasks={'A','A','A','B','B','B'};
        int n=2;
        Map <Character,Integer> map = new TreeMap<>();
        for(Character c: tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxfreq = Collections.max(map.values());
        int max = 0;
        for(int i : map.values()){
            if(i == maxfreq)
            max++;
        }
        System.out.println( Math.max((maxfreq-1)*(n+1)+max,tasks.length));
    }
}





