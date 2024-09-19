package _17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _230_FirstNegativeElementInKSizeWindow {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={-8,2,3,-6,10};
        int n=arr.length;
        int k=2;
        int resSize=n-k+1;
        int[] res=new int[resSize];

        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) que.add(i);
        }

        for(int i=0;i<resSize;i++){
//            if(que.peek()>=i && que.peek()<=i+k-1) res[i]= arr[que.peek()];
//            else {
//                que.remove();
//                //res[i]=0;
//            }

            //ya
            if(que.size()!=0 && que.peek()<i) que.remove();
            if(que.size()!=0 && que.peek()<=i+k-1) res[i]=arr[que.peek()];
        }
       print(res);
    }
}
