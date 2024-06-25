package _11_recursion;

import java.util.Scanner;

public class _144_sum1toN {


//    public static void sum(int n,int s){  //int s=0; like int sum=0; ki trah
//        if(n==0) {     //base case
//            System.out.println(s);
//            return;
//        }
//        sum(n-1,s+n);   // cal and work
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("entre an integer");
//        int n=sc.nextInt();
//        sum(n,0);
//    }

    public static int sum(int n){
        if(n==1 || n==0) return n;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre an integer");
        int n=sc.nextInt();
        int s=sum(n);
        System.out.println(s);
    }
}
