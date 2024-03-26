package _05_arraysAndArrayLists;

import java.util.Arrays;

public class _58b_ {
    public static void main(String[] args) {
        int[] arr={30,40,50,60,70};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] brr = Arrays.copyOf(arr,7); //deep copy

        brr[5]=1800;

        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
