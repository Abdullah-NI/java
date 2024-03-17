package _04_patternPrinting._01_square;

import java.util.Scanner;

public class _28_AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=n;j++){  //column
//                char ch = (char)(j+64);
//                System.out.print(ch+" ");
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
    }
}
