package _02_conditionals;

import java.util.Scanner;

public class _12_PrintGradeTakingInputPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter percentage");
        int n=sc.nextInt();

//        if(n>=81) System.out.println("very good");
//        if(n>=61 && n<=80) System.out.println("good");
//        if(n>=41 && n<=60) System.out.println("Average");
//        if(n<=40) System.out.println("fail");

        if(n>=81) System.out.println("very good");
        else if(n>=61 ) System.out.println("good");
        else if(n>=41 ) System.out.println("Average");
        else System.out.println("fail");
    }
}
