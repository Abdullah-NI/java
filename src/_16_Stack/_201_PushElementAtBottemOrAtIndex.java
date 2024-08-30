package _16_Stack;

import java.util.Stack;

public class _201_PushElementAtBottemOrAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);


        //Insert  at boottem or end
        int element=1000;
        Stack<Integer> st_temp=new Stack<>();
        while(st.size()>0){
            st_temp.push(st.pop());
        }
        st.push(element);
        while(st_temp.size()>0){
            st.push(st_temp.pop());
        }
        System.out.println(st);


        //insert at any index 1 based indexing
        int idx=2;
        int ele=500;
        while(st.size()>=idx){      //st.size()!=idx-1;
            st_temp.push(st.pop());

        }
        System.out.println(st_temp);
        st.push(ele);
        while (st_temp.size()>0){
            st.push(st_temp.pop());
        }
        System.out.println(st);
    }
}
