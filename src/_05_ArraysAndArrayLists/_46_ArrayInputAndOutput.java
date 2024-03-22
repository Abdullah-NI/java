package _05_ArraysAndArrayLists;

import java.util.Scanner;

public class _46_ArrayInputAndOutput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[7];
        //input loop
        for(int i=0;i<=6;i++){
            arr[i]= sc.nextInt();
        }
        //output
        for(int i=0;i<=6;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
