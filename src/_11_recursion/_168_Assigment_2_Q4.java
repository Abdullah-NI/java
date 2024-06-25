package _11_recursion;

public class _168_Assigment_2_Q4 {
    public static void printrow(int[] arr,int i,int j){
        if(j>arr.length-1-i) return;
        if(i==0){
            System.out.print(arr[j]+" ");
            printrow(arr,i,j+1);
        }
        else{
            arr[j]=arr[j]+arr[j+1];
            System.out.print(arr[j]+" ");
            printrow(arr,i,j+1);
        }
    }
    public static void printSumTriangle(int[] arr,int i){
        if(i==arr.length) return;
        printrow(arr,i,0);
        System.out.println();
        printSumTriangle(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        printSumTriangle(arr,0);
    }
}
