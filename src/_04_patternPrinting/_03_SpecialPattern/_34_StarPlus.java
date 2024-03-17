package _04_patternPrinting._03_SpecialPattern;

import java.util.Scanner;

public class _34_StarPlus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 || j==n/2+1) System.out.print("*"+" ");
                else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }
}
