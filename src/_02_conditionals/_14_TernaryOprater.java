package _02_conditionals;

import java.util.Scanner;

public class _14_TernaryOprater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no");
        int n=sc.nextInt();

        //in java this is not valid but in c++ it is valid
      //  n%2==0 ? System.out.println("even") : System.out.println("");
        System.out.println(n%2==0?"even":"odd");
        System.out.println(n%2==0? n+2:n+1);
    }
}
