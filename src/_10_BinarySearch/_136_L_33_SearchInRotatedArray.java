package _10_BinarySearch;

public class _136_L_33_SearchInRotatedArray {
    public  static boolean search(int[] arr,int lo,int hi,int target){
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,0,1,2};
        int n=arr.length;
        int target=2;
        boolean flag=false;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){ flag=true; break;}
            else if(arr[mid]<=arr[hi]){  //so we are in left sorted aray(isme mid to everything high sorted hai
                if(target>arr[mid] && target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
            else if(arr[mid]>arr[hi]){  //so we are in right(isme lo to mid everything is sorted
                if(target<=arr[lo] && target<arr[mid]) hi=mid-1;
                else lo=mid +1;
            }
        }
        if(flag==true) System.out.println("element found");
        else System.out.println("element not found");




        //find pavoit;
//        int pav=-1;
//        int lo=0,hi=n-2;// chuki pavoiot last me nhi milega
//        while(lo<=hi){
//            int mid=lo+(hi-lo)/2;
//            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {pav=mid; break;} //ex for 7
//            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) {pav=mid-1; break;}
//            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
//                if(arr[mid]>arr[n-1]) lo=mid+1;    //means we in left side of 7
//                else {  // arr[mid]<arr[n-1]    // means we in right side of 7
//                    hi=mid-1;
//                }
//            }
//
//        }
//        //System.out.println(pav);
//        if(pav==-1){
//            boolean flag =search(arr,0,n-1,target);
//            if(flag==true) System.out.println("element found");
//            else System.out.println("not found");
//        }
//
//        //now search in before seven and after seven
//        boolean flag1=search(arr,0,pav,target);
//        boolean flag2=search(arr,pav+1,n-1,target);
//        if(flag1==true || flag2==true) System.out.println("element found");
//        else System.out.println("not found");
    }
}
