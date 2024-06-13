package _09_basicSortingAlgorithms;

public class _125_SelectionSort {
    public static void print(int[] arr){
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
    public static void main(String[] args) {
        int[] arr={10,-4,20,1,-6,8};
        print(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minidx=j;
                }

            }
            //swap arr[i] and arr[minidx]
            //swap(arr,i,minidx);
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
        print(arr);



        // but according to me selection sort can be optimise and best case complexity is O(n)

//        int[] arr={2,1,3,4,5};
//        print(arr);
//        int n=arr.length;
//        int count =0;
//        for(int i=0;i<n-1;i++){
//            int min=arr[i];
//            int minidx=-1;
//            boolean flag=true;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]<min){
//                    min=arr[j];
//                    minidx=j;
//                    flag=false;
//                }
//                count++;
//            }
//            if(flag==true) break;
//            //swap arr[i] and arr[minidx]
//            // swap(arr,i,minidx);
//            int temp=arr[i];
//            arr[i]=arr[minidx];
//            arr[minidx]=temp;
//        }
//        print(arr);
//        System.out.println(count);
    }
}
