package _02_conditionals;

import java.util.Scanner;

public class _11b_GretestOfThreeNestedIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number");
        int b=sc.nextInt();
        System.out.print("Enter 3rd number");
        int c=sc.nextInt();
        if(a>b){
            if(a>c) System.out.println(a+"is largest");
            else //c>=a>b
                System.out.println(c+"is largest");
        }
        else{  // b>=a
            if(b>c) System.out.println(b+"is largest");
            else // c>=b>=a
                System.out.println(c+"is largest");
        }
    }
}
