package _10_BinarySearch;

public class _130_BinarySearch {
    public static void main(String[] args) {
        int[]arr={10,15,21,34,81,105,180,500,614}; //sorted array
        int target=34;  // ye element hi==l0 condition per mila
        int n=arr.length;
        int lo=0; int hi=n-1;
        boolean flag=false;  //means not present
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<target) lo=mid+1;
            else if(arr[mid]>target) hi=mid-1;
            else {  //arr[mid]==target
                flag=true;  // means persent
                break;
            }
        }
        if(flag==true) System.out.println("Element found");
        else System.out.println("not found");
    }
}
