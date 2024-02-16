package _01_basics;

import java.util.Scanner;

public class _04c_TakingTwoNoInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a=sc.nextInt();
        System.out.print("Enter 2st no: ");
        int b=sc.nextInt();

        System.out.println("the sum of two no is = "+(a+b));
    }
}
