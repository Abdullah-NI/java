package _04_patternPrinting._04_CompositePattern;

import java.util.Scanner;

public class _40_StarPyramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=n-i;j++){  //spaces
                System.out.print(" "+" ");

            }

            for(int j=1;j<=2*i-1;j++){  //star
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}
