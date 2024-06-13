package _10_BinarySearch;

public class _131_LowerBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int target=35;
        System.out.println("lower bound of "+target+":");
        int n=arr.length;
         int lo=0,hi=n-1;

        int lb = n;// means 8
         while(lo<=hi){
             int  mid=(lo+hi)/2;
             if(arr[mid]>=target) {
                 lb=Math.min(lb,mid);
                 hi=mid-1;
             }
             else {// arr[mid]<x
                 lo=mid+1;
             }
         }

        System.out.println(lb);

    }
}
