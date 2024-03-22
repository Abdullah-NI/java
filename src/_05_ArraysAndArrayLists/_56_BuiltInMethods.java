package _05_ArraysAndArrayLists;

import java.util.Arrays;

public class _56_BuiltInMethods {
    public static void main(String[] args) {
        int[] arr ={23,12,45,67,34,27,90,40};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
