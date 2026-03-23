public class First_occ {
    static void main(String[] args) {
        int[] arr={0,0,0,1};
        int tar=0;
        int l=0;
        int r= arr.length-1;
        System.out.println(focc(arr,l,r,tar));
    }

    public static int focc(int[] arr, int l, int r, int tar) {
        int mid=(l+r)/2;
        int c=0;
        if(l>r){
            return -1;
        }
        if(arr[mid]==tar){
            if (mid == 0 || arr[mid - 1] != tar) {
                return mid;
            }
            return focc(arr,l,mid-1,tar);
        } else if (arr[mid]<tar) {
            return focc(arr,mid+1,r,tar);
        }
        else {
            return focc(arr,l,mid-1,tar);
        }

    }
}
