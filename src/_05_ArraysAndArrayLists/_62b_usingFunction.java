package _05_ArraysAndArrayLists;

public class _62b_usingFunction {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int i=0,j=n-1;  //i=1,j=5; reverse part of arry
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println();
        for( i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int  temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
