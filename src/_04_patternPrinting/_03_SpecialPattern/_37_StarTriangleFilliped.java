package _04_patternPrinting._03_SpecialPattern;

import java.util.Scanner;

public class _37_StarTriangleFilliped {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=n;j++){  //column
               if(i+j<n+1) System.out.print(" "+" ");
               else System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}
