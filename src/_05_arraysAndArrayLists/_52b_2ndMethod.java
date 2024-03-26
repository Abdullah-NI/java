package _05_arraysAndArrayLists;

public class _52b_2ndMethod {
    public static void main(String[] args) {
        int[] arr={3,4,9,6,7,8,9};
        int max=Integer.MIN_VALUE;
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
           // if(arr[i]>max) max=arr[i];
            max=Math.max(max,arr[i]);

        }
        System.out.println("Max Element In array is "+max);
    }
}
