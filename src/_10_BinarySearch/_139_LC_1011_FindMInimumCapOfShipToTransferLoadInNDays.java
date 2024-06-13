package _10_BinarySearch;

public class _139_LC_1011_FindMInimumCapOfShipToTransferLoadInNDays {
    public static boolean isPossibal(int[] arr,int cap,int days){   // my creat function
        int n=arr.length;
        int Dc=1;// days complete
        int load=0;
        for(int i=0;i<n;i++){
            if(load+arr[i]<=cap) load=load+arr[i];
            else{
                load=arr[i];
                Dc++;
            }
        }
        if(Dc>days) return false;
        return true;
    }
    public static int shipWithinDays(int[] arr, int days) {   //int[] weights=int[] arr   mana hai
        int n=arr.length;
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);     //max is minimum valid capicity
            sum+=arr[i];                  // sum is maximum capicity
        }
        int lo=max,hi=sum,mincap=0;  //minimum capicity
        while(lo<=hi){ //T.C=O(n*log(sum-mx));  chuki function me n tak loop hai
            int mid=lo+(hi-lo)/2;  // mid is current capicity
            if(isPossibal(arr,mid,days)==true){
                mincap=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return mincap;
    }
    public static void main(String[] args) {
        int[] arr={3,2,2,4,1,4};
        int days=3;
        int minc= shipWithinDays(arr,days);
        System.out.println(minc);
    }
}
