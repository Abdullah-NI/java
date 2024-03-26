package _06_2DarraysMultiDimensionArray;

public class _83_MultiplicationOfTwoMatrix {
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
        int[][] a={{1,2,1},{2,1,2}};
        int[][] b={{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        int m=a.length,n=a[0].length;
        int p=b.length,q=b[0].length;
        print(a);
        print(b);

        if(n!=p){
            System.out.println("multiplication is not possible");
        }
        else{
            int[][] res =new int[m][q];
            for(int i=0;i<m;i++){
                for(int j=0;j<q;j++){
                   // res[i][j]=a[i][0]*[0][j]+a[i][1]*[1][j]+a[i][2]*[2][j]
                    for(int k=0;k<b.length;k++){
                        res[i][j]+=a[i][k]*b[k][j];
                    }
//                    int k=0,sum=0;
//                    while (k<b.length){
//                        sum=sum+a[i][k]*b[k][j];
//                        k++;
//                    }
//                    res[i][j]=sum;
                }
            }
            print(res);
        }


    }
}
