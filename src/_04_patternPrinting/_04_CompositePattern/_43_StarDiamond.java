package _04_patternPrinting._04_CompositePattern;

import java.util.Scanner;

public class _43_StarDiamond {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=2*n-1;i++){  //ros
            for(int j=1;j<=nsp;j++){  //spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){  //star
                System.out.print("*"+" ");
            }
            System.out.println();
            if(i<n){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }

        }
    }
}
