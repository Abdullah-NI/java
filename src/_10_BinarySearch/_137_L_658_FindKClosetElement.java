package _10_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class _137_L_658_FindKClosetElement {
    public static ArrayList<Integer> FindCloset(int[] arr ,int k, int x){
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        if(x<arr[0]){
            for(int i=0;i<k;i++) {
                ans.add(arr[i]);
            }
            return ans;
        }

         if(x>arr[n-1]){
            for(int i=n-1;i>=n-k;i--) {
                ans.add(arr[i]);
            }
             Collections.sort(ans);
            return ans;
        }

        int lb=n;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
       int j=lb,i=lb-1;
        while(k>0 && i>=0 && j<n){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else{
                ans.add(arr[j]);
                j++;
            }
            k--;
        }

        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }

        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        //_137_Find K Closet Element return in arraylist
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int x=3;
        int k=3;
        ArrayList<Integer> l=FindCloset(arr,k,x);
        System.out.println(l);
    }
}
