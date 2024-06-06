package _08_stringBuilders;

public class _105_equalsOprater {
    public static void main(String[] args) {
        String a= "abcxyz";
        String b= "abcxyz";
        String c = new String(a);
        String d= "abc";
        d=d+"xyz";

        System.out.println(a==b);    // same addres hai a,b ka
        System.out.println(d==c);    // a,c ka same addres nhi hai
        System.out.println(a.equals(c));     // a charcter wise c ke equal hai

        System.out.println(a==d);           // a, d ka address same nhi hai
        System.out.println(a.equals(d));
    }
}
