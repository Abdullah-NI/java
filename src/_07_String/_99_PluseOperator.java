package _07_String;

public class _99_PluseOperator {
    public static void main(String[] args){
        String s="abc";
        String t="pqr";
        s=s+t;    //s+=t;    // string +string=string
        System.out.println(s);
        s=s+100;                 // string +integer=string
        System.out.println(s);
        //OR
        System.out.println("Hi i am"+10);
        s=s+"z";                     // string +char=string
        System.out.println(s);
        System.out.println(s.length());

        System.out.println();

        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");


    }
}
