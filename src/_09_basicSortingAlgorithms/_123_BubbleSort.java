package _09_basicSortingAlgorithms;

public class _123_BubbleSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={4,2,6,8,1,0,-2};
        print(arr);
        int n =arr.length;

        //bubble sort 1
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        print(arr);

        //Bubblesort 2
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        print(arr);

        //bubble sort optimise
        for(int i=0;i<n-1;i++){
            boolean flag =true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }
}
