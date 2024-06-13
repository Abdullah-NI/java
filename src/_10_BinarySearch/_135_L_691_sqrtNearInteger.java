package _10_BinarySearch;

public class _135_L_691_sqrtNearInteger {
    //find sqrt of an intiger if it comes in point return its integer value
    public static int sqrt(int x){
//        int lo=0,hi=x;
//        while(lo<=hi){
//            int mid=lo+(hi-lo)/2;
//            if(mid*mid==x) return mid;
//            else if(mid*mid<x) lo=mid+1;
//            else if(mid*mid>x) hi=mid-1;
//        }
//        return hi;

        long lo=0,hi=x;  //ya hi=(long)x;  hamne nhi kara chuki apne aap type cast ho gaya
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(mid*mid==x) return (int)mid;    // yaha bhi mid*mid==(long)xx
            else if(mid*mid<x) lo=mid+1;
            else if(mid*mid>x) hi=mid-1;
        }
        return (int)hi;

        //without use of long
//        if(x<=1) return x;  // ye isliye likha if x is equal to 0 and 1 then value of mid is zero which is not valid because we use mid=x/mid in condition
//        int lo=0,hi=x;
//        while(lo<=hi){
//            int mid=lo+(hi-lo)/2;
//            if(mid==x/mid) return mid;
//            else if(mid<x/mid) lo=mid+1;
//            else if(mid>x/mid) hi=mid-1;
//        }
//        return hi;
    }
    public static void main(String[] args) {
        int x=2099999999;
//        int sqrt=(int)Math.sqrt(x);   //ye answer double me dega isliye int me type cast kiya
//        System.out.println(sqrt);
        int sqrt=sqrt(x);
        System.out.println(sqrt);
    }
}
