package _04_patternPrinting._02_triangle;

import java.util.Scanner;

public class _30_NoAndAlphabateTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=i;j++){  //column
                if(i%2!=0) System.out.print(j+" ");
                else System.out.print((char)(j+64)+" ");

            }
            System.out.println();
        }
    }
}
