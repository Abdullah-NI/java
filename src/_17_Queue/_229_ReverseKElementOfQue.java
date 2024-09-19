package _17_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _229_ReverseKElementOfQue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        Stack<Integer> st=new Stack<>();
        int k=3;

        while(k-->0){
            st.push(q.remove());
        }
        // or
//        for(int i=1;i<=k;i++){
//            st.push(que.remove());
//        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        for(int i=1;i<=q.size()-k;i++){
            int a=q.remove();
            q.add(a);
            //or
            //q.add(q.remove());
        }
        System.out.println(q);
    }
}
