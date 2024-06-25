package _11_recursion;

import java.util.Scanner;

public class _148_a_MazePath {
    public static int ways(int m,int n){
        if(n==1 || m==1) return 1;
        int ways =ways(m-1,n)+ways(m,n-1);   // ways=downways+rightways
        return ways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter no of column: ");
        int n=sc.nextInt();
        System.out.println("no of ways to reach bootom right corner is "+ways(m,n));
    }


    // OR is trah

//    public static int ways(int rows,int col,int m,int n){
//        if(rows==m || col==n) return 1;
//        int rightways=ways(rows,col+1,m,n);
//        int downways=ways(rows+1,col,m,n);
//        return rightways+downways;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of rows: ");
//        int m=sc.nextInt();
//        System.out.println("Enter no of column: ");
//        int n=sc.nextInt();
//        System.out.println("no of ways to reach bootom right corner is "+ways(1,1,m,n));
//    }
}
