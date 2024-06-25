package _11_recursion;

import java.util.Scanner;

public class _145_b_WithTimeComplextyLogn {
    public static int power(int a,int b){
        if(b==0) return 1;
        int ans=power(a,b/2);
        if(b%2==0) return ans*ans;
        else return a*ans*ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre base :");
        int a=sc.nextInt();
        System.out.println("enter power :");
        int b=sc.nextInt();
        if(a==0 &&  b==0) System.out.println("not define");
        else System.out.println(a+" rais to the power "+b+" is "+power(a,b));

    }
}
