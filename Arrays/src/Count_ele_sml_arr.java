import java.util.Arrays;
public class Count_ele_sml_arr {
    static void main(String[] args) {
        int[ ] arr={8,1,2,2,3};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        System.out.println(Arrays.toString(arr));
    }
}






