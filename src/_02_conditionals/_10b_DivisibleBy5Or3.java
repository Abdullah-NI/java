package _02_conditionals;

import java.util.Scanner;

public class _10b_DivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no");
        int n=sc.nextInt();

        if(n%5==0 || n%3==0) System.out.println("no is divisible by 5 or 3");
        else System.out.println("no is not divisible by 5 or 3");
    }
}
