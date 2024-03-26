package _05_arraysAndArrayLists;

public class _53_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={2,3,4,23,45,67,7};
        int max=Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            // if(arr[i]>max) max=arr[i];
            max=Math.max(max,arr[i]);
        }

        for(int i=0;i<arr.length;i++) {
            if (arr[i] != max)
                smax = Math.max(smax, arr[i]);
                // if(arr[i]>smax && arr[i]!=max) smax=arr[i];

            }
            System.out.println("Max Element In array is " + max);
            System.out.println("second Max Element In array is " + smax);


    }
}
