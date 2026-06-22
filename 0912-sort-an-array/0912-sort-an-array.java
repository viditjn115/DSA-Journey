class Solution {
    public void sort(int[] arr, int low ,int mid, int high ){
        int n1=mid-low+1;
        int n2=high - mid;
        int[] arr_1=new int[n1];
        int[] arr_2=new int[n2];
        for(int i=0;i<n1;i++){
            arr_1[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            arr_2[j]=arr[mid+1+j];
        }
        int p1=0;
        int p2=0;
        int k=low;
        while(p1<n1 && p2<n2){
            if (arr_1[p1] <= arr_2[p2]) {
                arr[k] = arr_1[p1];
                p1++;
            }
            else {
                arr[k] = arr_2[p2];
                p2++;
            }
            k++;
        }
        while (p1 < n1) {
            arr[k] = arr_1[p1];
            p1++;
            k++;
        }
        while (p2 < n2) {
            arr[k] = arr_2[p2];
            p2++;
            k++;
        }
    }
    public void mergeSort(int arr[], int low, int high){
        
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            sort(arr, low, mid, high);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}