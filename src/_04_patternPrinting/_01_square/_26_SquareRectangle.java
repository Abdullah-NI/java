package _04_patternPrinting._01_square;

import java.util.Scanner;

public class _26_SquareRectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();
        System.out.print("Enter no of column");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=m;j++){  //column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
