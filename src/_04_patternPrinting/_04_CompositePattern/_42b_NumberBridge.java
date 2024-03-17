package _04_patternPrinting._04_CompositePattern;

import java.util.Scanner;

public class _42b_NumberBridge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        int nsp=1;
        for(int i=1;i<=n;i++){  //ros
            int a=1;
            for(int j=1;j<=n+1-i;j++){  //star
                System.out.print(a+" ");
                a++;
            }
            for (int j = 1; j <=nsp; j++) {  //space
                System.out.print(" " + " ");
                a++;  // important point
            }
            nsp+=2;

            for(int j=1;j<=n+1-i;j++){  //star
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
