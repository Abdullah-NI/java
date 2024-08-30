package _16_Stack;

import java.util.Stack;

public class _205_BalancedBracket {
    public static void main(String[] args) {
        String s="[](){}";
        Stack<Character> st=new Stack<>();
        int n=s.length();
        //boolean flag=true;
//        for(int i=0;i<n;i++){
//            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') st.push(s.charAt(i));
//            else {
//                if(st.peek()=='(' && s.charAt(i)==')') st.pop();
//                else if(st.peek()=='{' && s.charAt(i)=='}')  st.pop();
//                else if(st.peek()=='[' && s.charAt(i)==']') st.pop();
//               // else flag=false;
//            }
//        }
//        if(st.isEmpty()) System.out.println("bracket is balance");
//        else System.out.println("bracket is not balance");
        char[] arr=s.toCharArray();
        boolean flag=true;
        for(char ch:arr){
            if(ch=='(') st.push(')');
            else if(ch=='{') st.push('}');
            else if(ch=='[') st.push(']');
            else if(st.isEmpty() || st.peek()!=ch){
               flag=false;
               break;
            }
        }
        if(flag==true) System.out.println("bracket is balance ");
        else System.out.println("bracket is not balance");

    }
}
