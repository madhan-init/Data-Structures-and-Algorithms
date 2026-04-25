public class Merge_sort {
    static void main(String[] args) {
        int[] arr={10,30,20,50,40,60};
        int low=0;
        int high= arr.length-1;
        mergeSort(arr,low,high);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static void mergeSort(int arr[],int low,int high){
        int mid=(low+high)/2;
        if(low>=high){
            return;
        }
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high - low + 1];
        int left=low;
        int right=mid+1;
        int i=0;
        while (left <= mid && right <= high){
            if (arr[left]<=arr[right]){
                temp[i]=arr[left];
                i++;
                left++;
            }
            else {
                temp[i]=arr[right];
                right++;
                i++;
            }
        }
        while (left<=mid){
            temp[i]=arr[left];
            left++;
            i++;

        }
        while (right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        for ( i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

    }
}
