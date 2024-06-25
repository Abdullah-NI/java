package _11_recursion;

import java.util.Scanner;

public class _143b_1ToN {
//    public static void print(int x,int n){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1,n);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("entre an integer");
//        int n=sc.nextInt();
//        int x=1;
//        print(x,n);
//    }

    //using global varibal
// static int n;
//    public static void print(int x){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("entre an integer");
//         n=sc.nextInt();
//        int x=1;
//        print(x);
//    }

    public static void print(int n){
        if(n==0) return;        //base case
        print(n-1);             //call
        System.out.println(n); // work

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre an integer");
        int n=sc.nextInt();
        print(n);
    }
}
