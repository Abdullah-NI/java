package _16_Stack;

import java.util.Stack;

public class _209b_UsingStack {
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
       // ans[0]=1;
        Stack<Integer> st=new Stack<>();
        st.push(0);

        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i]){   //arr[i]>=arr[st.peek()];
                st.pop();
            }
            if(st.size()==0) ans[i]=i+1;
            else ans[i]=i-st.peek();

            st.push(i);
        }
        print(arr);
        print(ans);
    }
}
