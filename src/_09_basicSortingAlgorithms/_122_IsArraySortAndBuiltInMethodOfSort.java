package _09_basicSortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _122_IsArraySortAndBuiltInMethodOfSort {
    public static void main(String[] args) {
        int[] arr ={1,7,3,8,9,12};
        int n=arr.length;
        boolean flag=true;  //-> means ayyar sort
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) {
                flag=false;
                break;
            }
        }
        if(flag==true) System.out.println("sorted array");
        else System.out.println("unsorted array");

        // sor the array by built in method
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
