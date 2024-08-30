package _16_Stack;

import java.util.Stack;

public class _219_PostfixToPrifix {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<String> val=new Stack<>();
        for(int i=0;i<s.length();i++){   // sidhe loop
            char ch=s.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57){
//                String t=ch+"";
//                val.push(t);
                val.push(ch+"");
            }
            else{
                String v2=val.pop();  //  yaha change v1 and v2 intechang w.r.t.q 217
                String v1=val.pop();

                String t=ch+v1+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
