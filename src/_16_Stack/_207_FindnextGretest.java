package _16_Stack;

import java.util.Stack;

public class _207_FindnextGretest {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        ans[n-1]=-1;
        st.push(arr[n-1]);

        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();

            st.push(arr[i]);
        }
        print(ans);
    }
}
