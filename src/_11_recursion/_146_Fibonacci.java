package _11_recursion;

import java.util.Scanner;

public class _146_Fibonacci {
    public static int fibo(int n){
        if(n<=1) return n;           // 0th term is 0 and 1st term is one
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre an integer");
        int n=sc.nextInt();
        System.out.println(n+" fibonacci no is "+fibo(n));
    }
}
