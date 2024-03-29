package _07_String;

public class _097_substring {
    public static void main(String[] args) {
        String s="abcde";

        System.out.println(s.substring(1));  // print index 1 to last
        System.out.println(s.substring(2));

        System.out.println();

        System.out.println(s.substring(1,4));   // print from index 1 to 3 i.e 4-1
        System.out.println(s.substring(2,2));  //print from 2 to 1 i.e noting
        System.out.println(s.substring(2,3));

    }
}
