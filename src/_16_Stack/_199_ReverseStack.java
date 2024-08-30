package _16_Stack;

import java.util.Stack;

public class _199_ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1);


        Stack<Integer> st2=new Stack<>();
//        while(!st1.isEmpty()){
////            int ele=st1.pop();
////            st2.push(ele);
//            st2.push(st1.pop());
//        }
//        System.out.println(st2);

        while(st1.size()!=0){     //ya st1.size()>0
//            int ele=st1.pop();
//            st2.push(ele);
            st2.push(st1.pop());
        }
        System.out.println(st2);
    }
}
