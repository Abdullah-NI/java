package _06_2DarraysMultiDimensionArray;

public class _79_WaveForm {
    public static void print(int[][] arr){
        int m=arr.length,n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length,n=arr[0].length;
        print(arr);

        //wave form row wise
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        //wave form column wise

        for (int j = 0; j < m; j++) {
            if(j%2==0){
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int i = n-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
