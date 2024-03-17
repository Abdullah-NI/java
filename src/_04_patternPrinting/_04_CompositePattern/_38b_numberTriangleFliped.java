package _04_patternPrinting._04_CompositePattern;

import java.util.Scanner;

public class _38b_numberTriangleFliped {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=n-i;j++){  //spaces
                System.out.print(" "+" ");

            }

            for(int j=1;j<=i;j++){  //star
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
