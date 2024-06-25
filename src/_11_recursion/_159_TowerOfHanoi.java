package _11_recursion;

import java.util.Scanner;

public class _159_TowerOfHanoi {
    static int moves=0;
    public static void hanoi(char source,char intermid,char destin,int n){
        if(n==0) return;
        hanoi(source,destin,intermid,n-1);   /// is call se chote triangle ko intermid i.e. (iske liye destin )per pahucha diya
        System.out.println("Move "+n+" disk from "+source+" -> "+destin);     //// ye largest disk ko source se destination per pahucha diya
        moves++;
        hanoi(intermid,source,destin,n-1);       // yaha chote triangle ko jo helper (iske liye source) per hai use destination per pahucha diya.

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of disk");
        int n=sc.nextInt();
        hanoi('a','b','c',n);
        System.out.println("no of moves is "+moves);
    }
}
