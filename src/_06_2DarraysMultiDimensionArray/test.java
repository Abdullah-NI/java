package _06_2DarraysMultiDimensionArray;

public class test {
    public static void main(String[] args) {
//        int[][][] arr ={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
//
//        for(int[][] ele:arr){
//            for(int[] x: ele){
//                for(int y:x){
//                    System.out.print(y+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            System.out.println();
//        }
        int[][] a=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
