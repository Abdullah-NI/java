package _02_conditionals;

import java.util.Scanner;

public class _06_EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();

        if(n%2==0) System.out.println(n+" is a even no");
//        if(n%2==1) System.out.println(n+" is a Odd no");
         else   System.out.println(n+" is a odd no");
    }

}
