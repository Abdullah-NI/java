package _16_Stack;

import java.util.Stack;

public class _208_PriviousGreatestElement {
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
        ans[0]=-1;
        st.push(arr[0]);

        for(int i=1;i<n;i++){
            while(st.size()>0 && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();

            st.push(arr[i]);
        }
        print(arr);
        print(ans);
    }
}
