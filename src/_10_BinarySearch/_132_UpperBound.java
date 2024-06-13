package _10_BinarySearch;

public class _132_UpperBound {
    public static void main(String[] args) {
        int[] arr={10,20,30,30,40,50,60,70};
        int target=35;
        System.out.println("upper bound of "+target+":");
        int n=arr.length;
        int lo=0,hi=n-1;

        int ub = n;// means 8
        while(lo<=hi){
            int  mid=(lo+hi)/2;
            if(arr[mid]>target) {
                ub=Math.min(ub,mid);
                hi=mid-1;
            }
            else {// arr[mid]<x
                lo=mid+1;
            }
        }

        System.out.println(ub);
    }
}
