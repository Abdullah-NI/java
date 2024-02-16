package _01_basics;

import java.util.Scanner;

public class _05_CharDataType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character");
        char ch=sc.next().charAt(0);

        System.out.println(ch);

        int n=(int)ch;
        System.out.println(n);

        //Or
        System.out.println("ascii valu of "+ch+" is "+((int)ch));

        System.out.println('9');
        System.out.print("ascii valu of 9 is "+((int)'9'));
    }
}
