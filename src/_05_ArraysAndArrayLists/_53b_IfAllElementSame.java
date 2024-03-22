package _05_ArraysAndArrayLists;

public class _53b_IfAllElementSame {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            // if(arr[i]>max) max=arr[i];
            max=Math.max(max,arr[i]);
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            //if(arr[i]!=max) {smax=Math.max(smax,arr[i]);
            if(arr[i]>smax && arr[i]!=max)  {
                smax=arr[i];
                flag=true;
            }

        }
        System.out.println("Max Element In array is "+max);
        if(flag==true) System.out.println("second Max Element In array is "+smax);
        else System.out.println("second Max Element In array is "+max);

    }
}
