public class Rev_str {
    static void main(String[] args) {
        String hi="hello";
        char[] arr=hi.toCharArray();
        int r=hi.length()-1;
        int l=0;
        while (l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
        System.out.println(new String(arr));
    }
}
