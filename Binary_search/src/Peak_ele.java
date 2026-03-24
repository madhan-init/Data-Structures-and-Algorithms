public class Peak_ele {
    static void main(String[] args) {
        int[] arr={12,24,26,92,56,48,36,12};
        int i=0;
        int j=0;
        while (i<=j){
            if(arr[i]>arr[j]){
                System.out.println(arr[i]);
                break;
            }else {
                i++;
                j+=2;            }
        }
    }
}
