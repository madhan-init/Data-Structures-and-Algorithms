public class Last_occ {
    static void main(String[] args) {
        int[] arr={0,0,0,1};
        int tar=0;
        System.out.println(locc(arr,0,arr.length-1,tar));
    }
    public static int locc(int[] arr, int l, int r, int tar) {
        if(l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if(arr[mid]==tar){
            if(mid== arr.length-1|| arr[mid+1]!=tar ){
                return mid;
            }
            return locc(arr, mid+1, r, tar);
        } else if (arr[mid]<tar) {
            return locc(arr,mid+1,r,tar);
        }else {
            return locc(arr,l,mid-1,tar);
        }
    }
}



