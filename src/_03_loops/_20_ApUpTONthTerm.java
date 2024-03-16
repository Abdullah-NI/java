package _03_loops;

import java.util.Scanner;

public class _20_ApUpTONthTerm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of term");
        int n=sc.nextInt();
//        for(int i=1;i<=2*n-1;i+=2){  // nth term is 2n-1;
//            System.out.println(i);
//
//        }
        int a=1, d=2;
        for(int i=1;i<=n;i++){

            System.out.println(a);
            a+=d;  // here valu of discriminant is i.e d= 2
        }
    }
}
