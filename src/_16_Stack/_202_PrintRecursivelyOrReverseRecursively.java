package _16_Stack;

import java.util.Stack;

public class _202_PrintRecursivelyOrReverseRecursively {
    public static void displaySameOrder(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();

        displaySameOrder(st);
        System.out.print(top+" ");   //only yaha change

        st.push(top);
    }
    public static void displayReverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayReverse(st);

        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        displayReverse(st);
        System.out.println();
        displaySameOrder(st);

    }
}
