package _12_mergeAndQuickSorting;

public class _175_InversionCountProblem {
    static int count;
    public static void mergeTwoSortedArray(int[] a,int[] b,int [] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) {
                arr[k++]=a[i++];
            }
            else {  //a[i]>b[j]
                count+=a.length-i;
                arr[k++]=b[j++];
            }
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }

//    public static void countInversion(int[] a,int[] b){
//        int i=0,j=0;
//        while(i<a.length && j<b.length){
//            if(a[i]>b[j]){
//                count+=a.length-i;
//                j++;
//            }
//            else i++;
//        }
//    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<n/2;i++)  a[i]=arr[i];
        for(int i=0;i<n-n/2;i++) b[i]=arr[n/2+i];
        mergeSort(a);
        mergeSort(b);
      //  countInversion(a,b);
        // yadi is function ko use nhi kare to to mergeTwoSortedArray method me else me ye likh do only
        mergeTwoSortedArray(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr ={8,2,5,3,1,4};
        count=0;
        mergeSort(arr);
        System.out.println(count);
    }
}
