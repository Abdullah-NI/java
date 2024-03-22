package _05_ArraysAndArrayLists;

public class _61_TwoSum {
    public static void main(String[] args) {

        //Find Doublet Whose Sum is Equal to X
        int[] arr={2,3,1,0,4,3,6,};
        int x=6;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x) System.out.println(arr[i]+"->"+arr[j]);
            }
        }

    }
}
