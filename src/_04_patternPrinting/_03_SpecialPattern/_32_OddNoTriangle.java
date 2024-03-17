package _04_patternPrinting._03_SpecialPattern;

import java.util.Scanner;

public class _32_OddNoTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of row");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){  //ros
            int a=1;
            for(int j=1;j<=i;j++){  //column
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();

        }

//        for(int i=1;i<=n;i++){  //ros
//            for(int j=1;j<=i;j++){  //column
//                System.out.print(2*j-1+" ");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){  //ros
//            for(int j=1;j<=2*i-1;j+=2){  //column
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}
