package _05_ArraysAndArrayLists;

import java.util.Arrays;

public class _64_Sort0And1Array {
    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,1,0,1,0,1};
        int n=arr.length;

        //method 1
//        Arrays.sort(arr);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        //2nd method
        int noOfZeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeroes++;
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeroes) arr[i]=0;
            else arr[i]=1;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
