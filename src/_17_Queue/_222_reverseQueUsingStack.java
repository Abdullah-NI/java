package _17_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _222_reverseQueUsingStack {
    static Queue<Integer> que;
    public static void reverse(){
        Stack<Integer> st=new Stack<>();
        while(!que.isEmpty()){
            st.push(que.remove());
        }
        while(!st.isEmpty()){
            que.add(st.pop());
        }
    }
    public static void main(String[] args) {
       que =new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        que.add(80);
        System.out.println(que);
        reverse();
        System.out.println(que);



    }
}
