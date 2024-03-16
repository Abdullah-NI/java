package _03_loops;

import java.util.Scanner;

public class _20b_Gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of term");
        int n=sc.nextInt();
        int a=2, r=2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
    }
}
