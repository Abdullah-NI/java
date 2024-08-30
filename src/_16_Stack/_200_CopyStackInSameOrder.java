package _16_Stack;

import java.util.Stack;

public class _200_CopyStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1);

        Stack<Integer> st_temp =new Stack<>();
        while(!st1.isEmpty()){
            st_temp.push(st1.pop());
        }
        System.out.println(st_temp);

        Stack<Integer> st2=new Stack<>();
        while(!st_temp.isEmpty()){
            st2.push(st_temp.pop());
        }
        System.out.println(st2);
    }
}
