package _11_recursion;

public class _148_b_MazePathWithObstacal {
    public static int mazepath(int rows,int colm,int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        if(rows==m-1 || colm==n-1) return 1;
        int downways,rightways;
       if(arr[rows+1][colm]!=-1)  downways=mazepath(rows+1,colm,arr);
       else downways=0;
       if(arr[rows][colm+1]!=-1)  rightways=mazepath(rows,colm+1,arr);
       else rightways=0;
        return downways+rightways;
    }
    public static void main(String[] args) {
        //0,0,0,0
        //0,-1,0,0
        //-1,0,0,0
        //0,0,0,0
        // here -1 is obstacal person can not cross -1
        int[][] arr={{0,0,0,0},{0,-1,0,0},{-1,0,0,0},{0,0,0,0} };
       int path= mazepath(0,0,arr);
        System.out.println(path);
    }
}
