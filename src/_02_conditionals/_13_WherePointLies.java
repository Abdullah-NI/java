package _02_conditionals;

import java.util.Scanner;

public class _13_WherePointLies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x");
        int x=sc.nextInt();
        System.out.print("Enter y");
        int y=sc.nextInt();

        if(x==0&&y==0) System.out.println("point lies at origin");
        else if(x==0) System.out.println("point lies on y axis");
        else if(y==0) System.out.println("point lies on x axis");
        else if(x>0&&y>0) System.out.println("point lies in 1st Quadarant");
        else if(x<0&&y>0) System.out.println("point lies in 2st Quadarant");
        else if(x<0&&y<0) System.out.println("point lies in 3st Quadarant");
        else  System.out.println("point lies in 4st Quadarant");

    }
}
