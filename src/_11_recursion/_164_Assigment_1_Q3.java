package _11_recursion;

import java.util.Scanner;

public class _164_Assigment_1_Q3 {
    public static boolean isPowerOfTwo(int n){
        if(n==1) return true;
        if(n%2==0) return isPowerOfTwo(n/2);
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer; ");
        int n=sc.nextInt();
        boolean flag=isPowerOfTwo(n);
        System.out.println(flag);
    }
}
