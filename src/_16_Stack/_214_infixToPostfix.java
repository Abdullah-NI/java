package _16_Stack;

import java.util.Stack;

public class _214_infixToPostfix {
    public static void main(String[] args) {
        String s="8-(5+3)*(4/6)";
        System.out.println(s);
        Stack<String> val=new Stack<>();
        Stack<Character> opr=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57){  //means charactor is a number so push in val stack
                String t=""+ch;
                val.push(t);  //////yha push
            }
            else if(opr.size()==0 || ch=='(' || opr.peek()=='(') opr.push(ch);
            else if(ch==')'){                 // yha ye puri condition extra hai
                while(opr.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=opr.pop();
                    String t=v1+v2+o;  //--------> only in wali lines me  chang
                    val.push(t);

                }
                opr.pop();//to remove '('
            }
            else{
                if(ch=='+' || ch=='-'){
                    //we wil always  do the opraton
                    String v2=val.pop();
                    String v1=val.pop();                          // yha string hai v1,and v2
                    char o=opr.pop();
                    String t=v1+v2+o;
                    val.push(t);

                    opr.push(ch);
                }
                else if(ch=='*' || ch=='/' ){
                    if(opr.peek()=='*'|| opr.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=opr.pop();
                        String t=v1+v2+o;
                        val.push(t);

                        opr.push(ch);
                    }
                    else{
                        opr.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=opr.pop();
            String t=v1+v2+o;
            val.push(t);

        }
        System.out.println(val.peek());
    }
}
