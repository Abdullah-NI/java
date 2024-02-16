package _02_conditionals;

import java.util.Scanner;

public class _08_AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer");
        int n=sc.nextInt();
        if(n<0) System.out.println(-n);
        else System.out.println(n);
    }
}
