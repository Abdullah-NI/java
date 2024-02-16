package _02_conditionals;

import java.util.Scanner;

public class _10_ThreeDigitNoLogicalOprater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n>99 && n<1000) System.out.println("three digit no.");
        else System.out.println("not three digit no");
    }
}
