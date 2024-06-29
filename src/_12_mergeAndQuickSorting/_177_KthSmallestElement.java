package _12_mergeAndQuickSorting;

public class _177_KthSmallestElement {

    static int ans;

public static void printarr(int[] arr) {
    int n = arr.length;
    for (int ele : arr) {
        System.out.print(ele + " ");
    }
    System.out.println();
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public static void quickSelect(int[] arr, int lo, int hi, int k) {
    if (lo > hi) return;
    int pivot = arr[lo];
    int correIdx = lo;
    for (int i = lo + 1; i <= hi; i++) {
        if (pivot >= arr[i]) correIdx++;
    }
    //swap
    swap(arr, lo, correIdx);
    //maintain relative order
    int i = lo, j = hi;
    while (i < correIdx && j > correIdx) {
        if (arr[i] > arr[correIdx] && arr[j] <= arr[correIdx]) {
            swap(arr, i, j);
            i++;
            j--;
        } else if (arr[i] <= arr[correIdx]) i++;
        else if (arr[j] > arr[correIdx]) j--;
    }
    if (correIdx + 1 == k) {                      //yha se chang hua
        ans = arr[correIdx];
        return;
    }
    if (correIdx + 1 < k) quickSelect(arr, correIdx + 1, hi, k);
    else quickSelect(arr, lo, correIdx - 1, k);


}

public static void main(String[] args) {
    int[] arr = {4, 9, 1, 2, 6, 5, 8};
    int n = arr.length;
    printarr(arr);
    int k = 3;
    ans = -1;
    quickSelect(arr, 0, n - 1, k);   //if we want to find kth largest element only is line me n-k+1 pass karo k ki jagha
    System.out.println(ans);

}
//
//
//



























//    public static void printarr(int[] arr){
//        int n=arr.length;
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void swap(int[] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//
//    public static int quickSelect(int[] arr,int lo,int hi,int k){
//        if(lo>=hi) return arr[lo];
//        int pivot=arr[lo];
//        int correIdx=lo;
//        for(int i=lo+1;i<=hi;i++){
//            if(pivot>=arr[i]) correIdx++;
//        }
//        //swap
//        swap(arr,lo,correIdx);
//        //maintain relative order
//        int i=lo,j=hi;
//        while(i<correIdx || j>correIdx){
//            if(arr[i]>arr[correIdx] && arr[j]<=arr[correIdx]) {
//                swap(arr,i,j);
//                i++;j--;
//            }
//            else if(arr[i]<=arr[correIdx])  i++;
//            else if(arr[j]>arr[correIdx]) j--;
//        }
//        int n=arr.length;
//        int smallest=n-k+1;
//        if(correIdx+1<smallest) return quickSelect(arr,correIdx+1,hi,k);
//        if(correIdx+1>smallest) return quickSelect(arr,lo,correIdx-1,k);
//        return arr[correIdx];
//
//    }
//    public static void main(String[] args) {
//        int[] arr={4,9,7,1,3,2,3,6,5,8};
//        int n=arr.length;
//        printarr(arr);
//        int k=3;
//
//        int ans= quickSelect(arr,0,n-1,k);
//        System.out.println(ans);
//
//    }
}
