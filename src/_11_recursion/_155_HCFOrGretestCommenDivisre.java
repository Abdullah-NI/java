package _11_recursion;

import java.util.Scanner;

public class _155_HCFOrGretestCommenDivisre {
    public static int hcf(int a,int b) {
       if(b%a==0) return a;
       return hcf(b%a,a);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st no");
        int a=sc.nextInt();
        System.out.println("enter 2nd no");
        int b=sc.nextInt();
        System.out.println(hcf(a,b));
    }


        //using for loop
//    public static void main(String[] args) {
//        int a=24,b=60;
//        int hcf=0;
//        for(int i=1;i<=Math.min(a,b);i++){
//            if(a%i==0 && b%i==0) hcf=i;
//        }
//        System.out.println(hcf);
//    }
}
