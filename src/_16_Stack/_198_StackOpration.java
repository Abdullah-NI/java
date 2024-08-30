package _16_Stack;

import javax.sound.midi.Soundbank;
import java.util.Stack;

public class _198_StackOpration {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(4);
        st.push(10);

        System.out.println(st);
        System.out.println(st.pop());     //it remove
        System.out.println(st);
        st.pop();
        System.out.println(st);

        st.push(12);
        st.push(78);
        st.push(34);
        System.out.println(st);
        System.out.println(st.peek());  //it dont remove
        System.out.println(st);
        st.peek();
        System.out.println(st);

        System.out.println(st.size());

        // to get 1st element
        while(st.size()>1){
            st.pop();
        }
        //in stact only one element remain
        System.out.println(st.peek());

        System.out.println(st.isEmpty());

    }
}
