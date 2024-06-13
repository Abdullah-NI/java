package _10_BinarySearch;

public class _134_L_852_MountainArray {
    public static void main(String[] args) {
        int[] arr={2,5,10,65,20,10};
        int n= arr.length;
        int peak=0;

        int lo=1,hi=n-2;  // chuki peak can not be present at idex 0 and last
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                peak=mid;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid+1;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi=mid-1;
        }
        System.out.println(peak);

        //by llinear search;  time complexity is o(n)
//        int peak=0;
//        for (int i = 1; i <n-1 ; i++) {
//            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) peak=i;
//        }
//        System.out.println(peak);
    }
}
