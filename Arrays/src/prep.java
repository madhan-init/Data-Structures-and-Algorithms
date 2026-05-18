
public class prep {
    static void main(String[] args) {
       int tar=7;
       int[] arr={1,2,3,4,5,7};
       HashMap<Integer,Integer> hashMap=new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
           int complement=tar-arr[i];
           if(hashMap.containsKey(complement)){
               System.out.println(hashMap.get(complement)+" " +i);
           }
           hashMap.put(arr[i],i);
        




        }

    }

