package _06_2DarraysMultiDimensionArray;

public class _75_RowWiseAndColumnWisePrinting {
    public static void main(String[] args) {
        //1 2
        //3 4
        //5 6
        int[][] arr={{1,2},{3,4},{5,6}};
        int m= arr.length;
        int n=arr[0].length;

        // row wise printing
        for (int i = 0; i < m; i++) {//rows ke liye
            for (int j = 0; j < n; j++) { //column ke liye
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        //column wise printing
        for (int j = 0; j < n; j++) {//column ke liye
            for (int i = 0; i < m; i++) {//rows ke liye
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
