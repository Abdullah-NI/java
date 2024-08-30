package _16_Stack;

import java.util.Stack;

public class _216_EvelutionOfPrifix {
    public static void main(String[] args) {
        String s="-9/*+5346";  // it is equal to "9-(5+3)*4/6'==4 aya ,s ka answer bhi for aana chaiye
        Stack<Integer> val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){   //yha chang hame reverse chalna hai
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }
            else{
                int v1=val.pop();   //yaha v2 ko v1 banaya ad v1 ko v2
                int v2=val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
