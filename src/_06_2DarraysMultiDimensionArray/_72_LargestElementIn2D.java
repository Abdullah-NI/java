package _06_2DarraysMultiDimensionArray;

public class _72_LargestElementIn2D {
    public static void main(String[] args) {
        int[][] arr={{5,63,89},{145,71,20}};
        int m=arr.length;
        int n=arr[0].length;

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              //  if(arr[i][j]>max) max=arr[i][j];
                max=Math.max(max,arr[i][j]);
           }
         }
        System.out.println(max);
    }
}
