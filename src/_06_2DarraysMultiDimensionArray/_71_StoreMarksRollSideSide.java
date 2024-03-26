package _06_2DarraysMultiDimensionArray;

import java.util.Scanner;

public class _71_StoreMarksRollSideSide {
    public static void main(String[] args) {
        int[][] arr=new int[4][2];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Roll No And Maks");
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
