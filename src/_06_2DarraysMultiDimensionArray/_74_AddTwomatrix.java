package _06_2DarraysMultiDimensionArray;

public class _74_AddTwomatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] brr={{5,63,89},{45,71,20},{2,3,4}};
        int m=arr.length;
        int n=brr[0].length;

        int[][] res=new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               res[i][j]=arr[i][j]+brr[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
