package _16_Stack;

import java.util.Stack;

public class _206_RemoveConsecutiveDuplicative {
    public static void main(String[] args) {
        String s="aaabbccde";
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();

        for(char ch:arr){
//            if(st.isEmpty()) st.push(ch);
//            else{
//                if(st.peek()==ch) st.pop();
//                else  st.push(ch);
//            }
            if(!st.isEmpty() && st.peek()==ch) st.pop();
            else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
       sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
}
