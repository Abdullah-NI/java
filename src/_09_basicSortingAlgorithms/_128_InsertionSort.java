package _09_basicSortingAlgorithms;

public class _128_InsertionSort {
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
    public static void main(String[] args){
        int[] arr={3,5,1,4,2};
        print(arr);
        int n=arr.length;
        //using for loop
        for(int i=1;i<=n-1;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
        //using while loop
//        for(int i=1;i<=n-1;i++){
//            int j=i;
//            while(j>=1 && arr[j]<arr[j-1]){
//                swap(arr,j,j-1);
//                j--;
//            }
//        }
        print(arr);
    }
}
