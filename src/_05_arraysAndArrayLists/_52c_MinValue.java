package _05_arraysAndArrayLists;

public class _52c_MinValue {
    public static void main(String[] args) {
        int[] arr={3,4,9,6,7,8,9};
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            // if(arr[i]>max) max=arr[i];
            min=Math.min(min,arr[i]);

        }
        System.out.println("Max Element In array is "+min);
    }
}
