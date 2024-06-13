package _10_BinarySearch;

public class _140_LC_2064MinimizedMaximumProductDistributionToAnyStore {
    public static boolean isPossibal(int maxQ,int[] arr,int n){  //here  mid=maxQ=max Quantity to be put in store
        int m=arr.length;                                  // my creat function
        int stores=0; //no of store completed
        for(int i=0;i<m;i++){
            if(arr[i]%maxQ==0) stores=stores+arr[i]/maxQ;
            else stores=stores+arr[i]/maxQ+1;
        }
        if(stores>n) return false;
        return true;
    }
    public static int minimizedMaximum(int n, int[] arr) {  //int[] quantities=int[] arr mana hai
        int m=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            max=Math.max(max,arr[i]);
        }
        int lo=1,hi=max, maxAns=0;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(isPossibal(mid,arr,n)==true){
                maxAns=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return maxAns;
    }
    public static void main(String[] args) {
        int[] arr={15,10,10};
        int n=7;
        int maxAns=minimizedMaximum(n,arr);
        System.out.println(maxAns);
    }
}
