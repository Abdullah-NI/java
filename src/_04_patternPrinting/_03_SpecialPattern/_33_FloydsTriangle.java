package _04_patternPrinting._03_SpecialPattern;

import java.util.Scanner;

public class _33_FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        int a=1;
        for(int i=1;i<=n;i++){  //ros
            for(int j=1;j<=i;j++){  //column
                System.out.print(a+" ");
                a++;
              //  System.out.print(a++ +" ");  //uper ki two line can be replace by this line
            }
            System.out.println();

        }
    }
}
