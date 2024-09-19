package _17_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _231_InterleaveFirstOfquewithecondHalf {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);   //1 2 3 4 , 5 6 7 8

        //interleavinng      // 1 5 2 6 3 7 4 8

        int n=q.size()/2;  // ise yaha alag se isliye nikala kuki har bar que ka size loop me decrese ka rhi hai

        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++){              //que=5,6,7,8
            st.push(q.remove());            //stack=1 2 3 4
        }

        while (!st.isEmpty()){
            q.add(st.pop());          //que 5,6,7,8,4,3,2,1
        }

        for(int i=1;i<=n;i++){        //que=4,3,2,1
            st.push(q.remove());            //stack=8
        }                                   //      7
                                            //      6
                                            //      5
        for(int i=1;i<=n;i++){
            q.add(st.pop());
            q.add(q.remove());     //now que 8 4 7 3 6 2 5 1
        }

        //reverse que
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
       System.out.println(q);

    }
}
