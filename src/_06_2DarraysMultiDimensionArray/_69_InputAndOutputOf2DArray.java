package _06_2DarraysMultiDimensionArray;

import java.util.Scanner;

public class _69_InputAndOutputOf2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];

        int m=arr.length;   //no of rows
        int n=arr[0].length; // no of column or zeros  row ki length
        //Input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
