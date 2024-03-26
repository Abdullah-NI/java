package _06_2DarraysMultiDimensionArray;

public class _84_MaxScoreAfterFlippingRowAurColumn {
    public static void print(int[][] arr){
        int m= arr.length,n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m=arr.length,n=arr[0].length;
        print(arr);
        ////put 1 at 0th position of ervry row
        for (int i = 0; i < m; i++) {
            if(arr[i][0]==0) { //flip that row i.e. 1 k0 0 and 0 ko 1 banado
                for (int j = 0; j < n; j++) {
                if(arr[i][j]==0) arr[i][j]=1;
                else arr[i][j]=0;
                }
            }
        }
      //  flip those column where no of zero is greter no of 1
        for(int j=1;j<n;j++){
            int noOfZeros=0;
            int noOfOnes=0;
            for (int i = 0; i < m; i++) {
                if(arr[i][j]==0) noOfZeros++;
                else noOfOnes++;
            }
            if(noOfZeros>noOfOnes){  //flip the column 1-->0 and 0-->1
                for (int i = 0; i < m; i++) {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }

            }
        }
        print(arr);

        //addition of binary into decimal
        int score=0;
        int x=1;
        for(int j=n-1;j>=0;j--){
            for (int i = 0; i < m; i++) {
                score=score+arr[i][j]*x;
            }
            x=x*2;
        }
        System.out.println(score);
    }
}
