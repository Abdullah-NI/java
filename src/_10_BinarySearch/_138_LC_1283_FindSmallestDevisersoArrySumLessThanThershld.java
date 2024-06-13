package _10_BinarySearch;

public class _138_LC_1283_FindSmallestDevisersoArrySumLessThanThershld {
    public static int smallestDivisor(int[] arr, int threshold) {
        int n=arr.length;
        int arrymax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arrymax=Math.max(arrymax,arr[i]);
        }

        //diviser rang is 1 to arrymax chuki tabhi arr ka sum == arr.length ke equal hoga aur thershold arr.length se 10 ki power 6 ho sakta hai

        int lo=1,hi=arrymax;
        int diviser=arrymax;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0) sum=sum+arr[i]/mid;
                else sum=sum+arr[i]/mid+1;
            }
            if(sum<=threshold){
                diviser=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return diviser;
    }

    public static void main(String[] args) {
        int[] arr={44,22,33,11,1};
        int threshold =5;
        int d=smallestDivisor(arr,threshold);
        System.out.println(d);
    }

}
