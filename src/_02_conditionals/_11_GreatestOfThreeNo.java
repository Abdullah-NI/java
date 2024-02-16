package _02_conditionals;

import java.util.Scanner;

public class _11_GreatestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number");
        int b=sc.nextInt();
        System.out.print("Enter 3rd number");
        int c=sc.nextInt();

        if(a>=b && a>=c) System.out.println(a+" is largest");
        else if(b>=c && b>=a) System.out.println(b+" is largest");
        else  System.out.println(c+" is largest");
    }
}
