package _05_ArraysAndArrayLists;

public class _65b_DutchFlagAlgorithm {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0};
        int n=arr.length;

        int mid=0, high=n-1, low=0;

        while(mid<=high){
            if(arr[mid]==0)  {
                swape(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid ++;
            else{    // arr[mid]==2;
                swape(arr,mid,high);
                high--;
            }
        }
        for(int ele :arr){
            System.out.print(ele+" ");
        }
    }

    public static void swape(int[] arr, int x, int y) {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
