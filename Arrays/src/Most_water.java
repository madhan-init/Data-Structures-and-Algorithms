public class Most_water {
    static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int l=0;
        int r= arr.length-1;
        int maxarea=0;
        int width=0;
        while (l<r){
            int minh=Math.min(arr[l],arr[r]);
            width=r-l;
            int area=minh*width;
            maxarea=Math.max(maxarea,area);
            if(arr[l]<arr[r]){
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println(maxarea);
    }
}
