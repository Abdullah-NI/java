package _06_2DarraysMultiDimensionArray;

public class _70_ForEachLoopIn2D {
    public static void main(String[] args) {

        //In 1 D Array
        int[] a={10,20,30};
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println();

        //in 2 D array
//        1 2 3
//        4 5 6
        int[][] b={{1,2,3},{4,5,6}};
        for(int[] ele:b){
            for(int subele:ele){
                System.out.print(subele+" ");
            }
            System.out.println();
        }

    }

}
