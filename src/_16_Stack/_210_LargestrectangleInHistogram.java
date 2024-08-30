package _16_Stack;

import java.util.Stack;

public class _210_LargestrectangleInHistogram {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3,1};
        int n=arr.length;
        print(arr);

        Stack<Integer> st=new Stack<>();
        int[] lse=new int[arr.length];     //lse=left sma
        int[] rse=new int[arr.length];

        // finding left smaller element
        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0) lse[i]=0;
            else lse[i]=st.peek()+1;

            st.push(i);
        }
        print(lse);

        //stack empty karo
        while(!st.isEmpty()){
            st.pop();
        }

        //finding right smaller element

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0) rse[i]=n-1;
            else rse[i]=st.peek()-1;

            st.push(i);
        }
        print(rse);

        //finding max area
        int maxa=0;
        for(int i=0;i<n;i++){
            maxa=Math.max(maxa,arr[i]*(rse[i]-lse[i]+1));
        }
        System.out.println("max area is "+maxa);
    }
}
