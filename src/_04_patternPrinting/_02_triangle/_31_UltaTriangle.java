package _04_patternPrinting._02_triangle;

import java.util.Scanner;

public class _31_UltaTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=n+1-i;j++){  //column
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}
