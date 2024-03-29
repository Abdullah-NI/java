package _07_String;

public class _096_toLowerCaseAndtoUpperCase {
    public static void main(String[] args) {
        String s="Raghave Garg IS 24 Yearse Old";
       // System.out.println(s.toLowerCase());  // only print hoga

        //s.toLowerCase();   -> ye work nhi karega
        //System.out.println(s);

        s=s.toLowerCase();   //yaha sring chang ho gai // ya String a=s.toLowerCase();
        System.out.println(s);

        s=s.toUpperCase();
        System.out.println(s);

        System.out.println();

        //concat()
        String a="abc";
        String b="xyz";
        System.out.println(a.concat(b));
        System.out.println(a);;
        a=a.concat(b);
        System.out.println(a);

    }


}
