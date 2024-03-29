package _07_String;

import java.util.Scanner;

public class _100_ConvertIntIntoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an intiger");
        int n=sc.nextInt();
        System.out.println(n);
        String s=n+"";
        System.out.println(s);
        System.out.println(s.length());
    }
}
