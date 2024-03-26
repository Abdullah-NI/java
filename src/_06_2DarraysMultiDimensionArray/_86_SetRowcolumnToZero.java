package _06_2DarraysMultiDimensionArray;

public class _86_SetRowcolumnToZero {
    // SetRowcolumnToZero if you find find zero at that position
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
      int[][] arr ={{1,1,1},{1,0,1},{1,1,1}};
      int m= arr.length,n=arr[0].length;
      print(arr);


// method 1 space complesity jayada hai  yaha m*n extra space use hua
     // int[][] help= Arrays.copyOf(arr,arr.length);  //ye shallow coppy bana raha hai 2D me
//        int[][] help=new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                help[i][j]=arr[i][j];
//            }
//        }
//      print(help);
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(help[i][j]==0){
//                    //set the ith row and jth column of arr to zero
//                    for (int k = 0; k < m; k++) {
//                        arr[k][j]=0;
//                    }
//                    for (int k = 0; k < n; k++) {
//                        arr[i][k]=0;
//                    }
//                }
//            }
//        }
       // print(arr);


    //method 2           // yaha kam sapace laga hai i.e. m+n extra space use hua
//    boolean[] row =new boolean[m];
//        boolean[] colm =new boolean[n];
//
//        //marking the particular row and column which we have to set zero leter
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i][j]==0){
//                    row[i]=true;
//                    colm[j]=true;
//                }
//            }
//        }
//        //set the true row to 0
//        for (int i = 0; i < m; i++) {
//            if(row[i]==true){
//                for (int j = 0; j < n; j++) {
//                    arr[i][j]=0;
//                }
//            }
//        }
//        //st the true column to 0
//        for (int j = 0; j < n; j++) {
//            if(colm[j]==true){
//                for (int i = 0; i < m; i++) {
//                    arr[i][j]=0;
//                }
//            }
//        }
     //   print(arr);



    //method 3    using constant extra space  only do variable hi banaye
        boolean zeroRow=false;
        boolean zeroCol=false;
        //check zero col
        for (int i = 0; i < m; i++) {
            if(arr[i][0]==0){
                zeroCol=true;
                break;
            }
        }
        // check zero row
        for (int j = 0; j < n; j++) {
            if(arr[0][j]==0){
                zeroRow=true;
                break;
            }
        }

//............................................................................................................
 //..................................................................................
        //travel in submatrix without 0th row and colum and use 0th row and colm as a extra space
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        //travel in the 0th column
        for (int i = 1; i < m; i++) {
            if(arr[i][0]==0){
                for (int j = 1; j < n; j++) {
                    arr[i][j]=0;
                }
            }
        }
        //travel in the 0th row
        for (int j = 1; j < n; j++) {
            if(arr[0][j]==0){
                for (int i = 1; i < m; i++) {
                    arr[i][j]=0;
                }
            }
        }
//...............................................................................
//..............................................................................
        if(zeroRow==true){
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }
        if(zeroCol==true){
            for (int i = 0; i < m; i++) {
                arr[i][0]=0;
            }
        }
        print(arr);


 // method 4 my method
//        List<List<Integer>> l=new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i][j]==0){
//                    List<Integer> x=new ArrayList<>();
//                    x.add(i);
//                    x.add(j);
//                    l.add(x);
//                }
//            }
//        }
//        for (int i = 0; i < l.size(); i++) {
//            int a=l.get(i).get(0);
//            int b=l.get(i).get(1);
//            for (int k = 0; k < n; k++) {
//                arr[a][k]=0;
//            }
//            for (int k = 0; k < m; k++) {
//                arr[k][b]=0;
//            }
//        }
        //print(arr);
    }
}
