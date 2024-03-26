package _05_arraysAndArrayLists;

import java.util.Arrays;

public class _58_DeepCopy {
    public static void main(String[] args) {
        int[] arr={30,40,50,60,70};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] brr = Arrays.copyOf(arr,arr.length); //deep copy
                        //OR
//        int[] brr=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            brr[i]=arr[i];
//        }


        for(int i=0;i<arr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        brr[0]=1000;
        System.out.println(arr[0]);  //here we get output 30
    }
}
