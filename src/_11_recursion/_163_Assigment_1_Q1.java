package _11_recursion;

import java.util.Scanner;

public class _163_Assigment_1_Q1 {
    public static int sumOddNo(int a,int b,int sum){
        if(a==b ){
            if(a%2!=0) return sum+a;
            else return sum;
        }
       if(a%2!=0) return sumOddNo(a+1,b,sum+a);
       return sumOddNo(a+1,b,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a=sc.nextInt();
        System.out.println("Enter Last no: ");
        int b=sc.nextInt();
        int sum=sumOddNo(a,b,0);
        System.out.println("the sum of odd no between "+a+" and "+b+" is "+sum);
    }
}
