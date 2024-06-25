package _11_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _168_b {


    public static void sumTriangle(int[] arr,ArrayList<int[]> l){
        if(arr.length==1) {
            l.add(arr);
            return;
        }

        l.add(arr);

        int[] nextLevel=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            nextLevel[i]=arr[i]+arr[i+1];
        }
        sumTriangle(nextLevel,l);
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
         ArrayList<int[]> l=new ArrayList<>();
        sumTriangle(arr,l);
        System.out.println(l);
    }
}
