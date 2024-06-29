package _12_mergeAndQuickSorting;

public class _178_Assigment_1_Q1 {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void mergeTwoSortedArray(int[] a,int[] b,int [] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //copy pasting
        for (int i = 0; i < n/2; i++) {
            a[i]=arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i]=arr[n/2+i];
        }
        //magic
        mergeSort(a);
        mergeSort(b);
        // merge these two sorte arry in parent arrye i.e in arr
        mergeTwoSortedArray(a,b,arr);
        // delet a and b for best space complexity
        a=null;b=null;


    }
    public static void main(String[] args) {
        int[] arr={3,5,2,8,1,4,10,9};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
