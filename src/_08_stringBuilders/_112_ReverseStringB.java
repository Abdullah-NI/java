package _08_stringBuilders;

import java.util.Scanner;

public class _112_ReverseStringB {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre a string");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
        // without built in function
//        int n=sb.length();
//        for (int i = 0,j=n-1; i <j; i++,j--) {
//            char temp=sb.charAt(i);
//            sb.setCharAt(i,sb.charAt(j));
//            sb.setCharAt(j,temp);
//        }

        // with built in function
        sb.reverse();
        System.out.println(sb);
    }
}
