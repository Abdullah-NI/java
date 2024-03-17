package _04_patternPrinting._02_triangle;

import java.util.Scanner;

public class _29_StarTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=i;j++){  //column
                System.out.print("* ");

//                System.out.print(j+" ");
//                1
//                1 2
//                1 2 3
//                1 2 3 4

//                System.out.print((char)(j+64)+" ");
//                A
//                A B
//                A B C
//                A B C D
            }
            System.out.println();
        }
    }
}
