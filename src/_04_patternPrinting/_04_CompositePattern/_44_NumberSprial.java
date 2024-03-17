package _04_patternPrinting._04_CompositePattern;

import java.util.Scanner;

public class _44_NumberSprial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no ");
        int n=sc.nextInt();
       // int a,b;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int  a=i,b=j;
                if(i>n) a=2*n-i;
                if(j>n) b=2*n-j;

//                if(i<j) System.out.print(i+" ");
//                else System.out.print(j+" ");
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}
