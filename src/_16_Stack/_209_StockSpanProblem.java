package _16_Stack;

import java.util.Stack;

public class _209_StockSpanProblem {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=1;

        for(int i=1;i<n;i++){
           ans[i]=1;
           for(int j=i-1;j>=0 && arr[i]>=arr[j];j--){
               ans[i]++;
           }
        }
        print(arr);
        print(ans);

    }
}
