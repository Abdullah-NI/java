package _01_basics;

import java.util.Scanner;

public class _04_TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("enter a value");
       int n=sc.nextInt();
       System.out.println(n*n);
    }
}
