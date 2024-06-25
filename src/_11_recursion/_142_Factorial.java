package _11_recursion;

import java.util.Scanner;

public class _142_Factorial {
    public static int factorial(int n){
        if(n==1 || n==0) return 1;  //base cae
        return n*factorial(n-1);   //call    // ya ye likho  int ans=n*factorial(n-1);
                                                               // return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre an integer");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
