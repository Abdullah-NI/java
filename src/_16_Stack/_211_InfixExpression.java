package _16_Stack;

import java.util.Stack;

public class _211_InfixExpression {
    public static void main(String[] args) {
        String s="9-5+3*4/6";
        System.out.println(s);
        Stack<Integer> val=new Stack<>();
        Stack<Character> opr=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57){  //means charactor is a number so push in val stack
                val.push(ascii-48);
            }
            else if(opr.size()==0) opr.push(ch);
            else{
                if(ch=='+' || ch=='-'){
                    //we wil always  do the opraton
                    int v2=val.pop();
                    int v1=val.pop();
                    if(opr.peek()=='+') val.push(v1+v2);
                    if(opr.peek()=='-') val.push(v1-v2);
                    if(opr.peek()=='*') val.push(v1*v2);
                    if(opr.peek()=='/') val.push(v1/v2);

                    opr.pop();
                    opr.push(ch);
                }
                else if(ch=='*' || ch=='/' ){
                    if(opr.peek()=='*'|| opr.peek()=='/'){
                        int v2=val.pop();
                        int v1=val.pop();
                        if(opr.peek()=='*') val.push(v1*v2);
                        if(opr.peek()=='/') val.push(v1/v2);

                        opr.pop();
                        opr.push(ch);
                    }
                    else{
                         opr.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if(opr.peek()=='+') val.push(v1+v2);
            if(opr.peek()=='-') val.push(v1-v2);
            if(opr.peek()=='*') val.push(v1*v2);
            if(opr.peek()=='/') val.push(v1/v2);

            opr.pop();
        }
        System.out.println(val.peek());
    }
}
