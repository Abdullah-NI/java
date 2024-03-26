package _06_2DarraysMultiDimensionArray;

public class _74b_withoutExtraArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] brr={{5,63,89},{45,71,20},{2,3,4}};
        int m=arr.length;
        int n=brr[0].length;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r=arr[i][j]+brr[i][j];
                System.out.print(r+" ");
                arr[i][j]=r;  //for storing in the same arry

            }
            System.out.println();
        }


        System.out.println();
//
        // for arr printing ke liye
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
