package _10_BinarySearch;

public class _133_L_34_FirstAndLastPosition {
    public static int[] find(int[] nums,int target){
        int[] ans=new int[2];
        int fp=-1;
        int n=nums.length;
        int lo,hi;
        //to find first position
        lo=0; hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                if(mid>0 && nums[mid]==nums[mid-1]) hi=mid-1;
                else{
                    fp=mid;
                    break;
                }
            }
            else if(nums[mid]<target) lo=mid+1;
            else if(nums[mid]>target) hi=mid-1;
        }
        //to find last position
        int lp=-1;
        lo=0; hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                if(mid+1<n && nums[mid]==nums[mid+1])lo=mid+1;
                else{
                    lp=mid;
                    break;
                }
            }
            else if(nums[mid]<target) lo=mid+1;
            else if(nums[mid]>target) hi=mid-1;
        }
        ans[0]=fp;
        ans[1]=lp;
        return ans;


        //using lower bound and upper bound;
//        int[] ans={-1,-1};
//        int n=nums.length;
//        int lo=0,hi=n-1;
//        boolean flag=false;
//        while(lo<=hi){
//            int mid=lo+(hi-lo)/2;
//            if(nums[mid]<target) lo=mid+1;
//            else if(nums[mid]>target) hi=mid-1;
//            else{
//                flag=true;
//                break;
//            }
//        }
//        if(flag==false) return ans;
//
//        //now find lower bound
//        int lb=n;
//        lo=0;hi=n-1;
//        while(lo<=hi){
//            int mid=lo+(hi-lo)/2;
//            if(nums[mid]>=target) {
//                lb=Math.min(lb,mid);
//                hi=mid-1;
//            }
//            else{
//                lo=mid+1;
//            }
//        }
//        ans[0]=lb;
//
//        //now find upper bound
//        int ub=n;
//        lo=0;hi=n-1;
//        while(lo<=hi){
//            int mid=lo+(hi-lo)/2;
//            if(nums[mid]>target) {
//                ub=Math.min(ub,mid);
//                hi=mid-1;
//            }
//            else{
//                lo=mid+1;
//            }
//        }
//        ans[1]=ub-1;
//
//        return ans;
    }
    public static void main(String[] args) {
        int[] nums={10,10,20,20,20,20,20,30,30,30,40};
        int target=20;
        int[] ans=find(nums,target);
        System.out.println(ans[0]+","+ans[1]);
        if(ans[0]==-1) System.out.println("occurence of "+target+" is  0");
        else System.out.println("occurence of "+target+" is "+(ans[1]-ans[0]+1));



    }
}
