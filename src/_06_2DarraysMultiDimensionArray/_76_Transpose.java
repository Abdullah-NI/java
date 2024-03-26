package _06_2DarraysMultiDimensionArray;

public class _76_Transpose {
    public static void main(String[] args) {
        //1 2
        //3 4
        //5 6
        int[][] arr={{1,2},{3,4},{5,6}};
        int m= arr.length;
        int n=arr[0].length;

        //transpose
        for (int j = 0; j < n; j++) {//column ke liye
            for (int i = 0; i < m; i++) {//rows ke liye
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //store transpose in another matrix
        int[][] trns=new int[n][m];
        for (int i = 0; i < n; i++) {//rows ke liye
            for (int j = 0; j < m; j++) { //column ke liye
               trns[i][j]=arr[j][i];
                System.out.print(trns[i][j]+" ");
            }
            System.out.println();
        }

//
    }
}
