package _06_2DarraysMultiDimensionArray;

public class _85_SearchTargetAssending2DArray {
    // row is assending from left to right
    //column is assending from top to bottom
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
        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22,},{10,13,14,17,24},{18,21,23,26,30}};
        int m=arr.length,n=arr[0].length;
        print(arr);


        int target=5;
        boolean flag=false;
        int i=0;
        int j=n-1;
        while(i<=m-1 && j>=0){
            if(arr[i][j]>target){//go left
                j--;
            }
            else if (arr[i][j]<target) {//go down
                i++;
            }
            else {//arr[i[j==target
                flag=true;
                break;
            }
        }
        // Or But ye efficient nhi hai
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(arr[i][j]==target) {
//                    flag=true;
//                    break;
//                }
//            }
//        }
        if(flag==true) System.out.println("target "+target+" is found");
        else System.out.println("target "+target+" is not found");
    }
}
