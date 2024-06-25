package _11_recursion;

import java.util.Scanner;

public class _147_StairPath {
    //if 1 or 2 jump are allow
    public static int ways(int n){
        if(n<=2) return n;
        int ways=ways(n-1)+ways(n-2);
        return ways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of stair: ");
        int n=sc.nextInt();
        System.out.println("no of ways to reach "+n+"th step(floor) is "+ways(n));
    }
}
