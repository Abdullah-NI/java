package _03_loops;

import java.util.Scanner;

public class _21_BreakUseORPrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int x=0; //means prime
        for(int i=2;i<n-1;i++){
            if(n%i==0) {
                System.out.println("number is composite");
                x=1; // means compossite
            }
        }
        if(n==1) System.out.println("number is not primr nor composite");
        else if(x==0) System.out.println("nimber is prime");

    }
}
