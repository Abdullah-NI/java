package _12_mergeAndQuickSorting;

public class _176b_UsingRandamizePIVoit {
    public static void printarr(int[] arr){
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void quickSort(int[] arr,int lo,int hi){
        if(lo>=hi) return;
        int mid=(lo+hi)/2;  //yaha chang
        int pivot=arr[mid]; //yaha chang
        int correIdx=lo;
        for(int i=lo;i<=hi;i++){   //yaha chang
            if(i==mid) continue;   //yaha chan
            if(pivot>=arr[i]) correIdx++;
        }
        //swap
        swap(arr,mid,correIdx);
        //maintain relative order
        int i=lo,j=hi;
        while(i<correIdx && j>correIdx){
            if(arr[i]>arr[correIdx] && arr[j]<=arr[correIdx]) {
                swap(arr,i,j);
                i++;j--;
            }
            else if(arr[i]<=arr[correIdx])  i++;
            else if(arr[j]>arr[correIdx]) j--;
        }
        //now recursion
        quickSort(arr,lo,correIdx-1);
        quickSort(arr,correIdx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr={4,9,7,1,3,2,3,6,5,8};
        printarr(arr);
        int n=arr.length;
        quickSort(arr,0,n-1);
        printarr(arr);
    }
}


