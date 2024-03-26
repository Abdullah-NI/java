package _05_arraysAndArrayLists;

import java.util.Scanner;

public class _63_RotateTheArrayByKStep {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter step  to rotate array");
        int k=sc.nextInt();
        k=k%n;
        swape(arr,0,n-1);
       swape(arr,0,k-1);
        swape(arr,k,n-1);

        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }

    private static void swape(int[] arr, int start, int end) {
       while(start<=end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }
}
