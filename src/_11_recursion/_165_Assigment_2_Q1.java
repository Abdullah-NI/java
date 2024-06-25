package _11_recursion;

public class _165_Assigment_2_Q1 {
    public static void printarr(int[] arr,int i){
        if(i<0) return;
        System.out.print(arr[i]+" ");
        printarr(arr,i-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printarr(arr,arr.length-1);
    }
}
