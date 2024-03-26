package _05_arraysAndArrayLists;

public class _52_MaxValueInArray {
    public static void main(String[] args) {
        int[] arr={3,4,9,6,7,8,9};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
           // if(arr[i]>max) max=arr[i];
            max=Math.max(max,arr[i]);

        }
        System.out.println("Max Element In array is "+max);
    }
}
