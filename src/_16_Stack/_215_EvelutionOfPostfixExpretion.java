package _16_Stack;

import java.util.Stack;

public class _215_EvelutionOfPostfixExpretion {
    public static void main(String[] args) {
        String s="953+4*6/-";  // it is equal to "9-(5+3)*4/6'==4 aya ,s ka answer bhi for aana chaiye
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v2=val.pop();
                int v1=val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
