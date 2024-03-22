package _05_ArraysAndArrayLists;

public class _67_NextGretestElement {
    public static void main(String[] args) {
        int[] arr={12,8,41,60,2,49,16,28,21};
        int n=arr.length;
        int[] ans=new int[n];
        ans[n-1]=-1;

        //method 1
//        for(int i=0;i<n-1;i++){
//            ans[i]=Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++){
//              //  if(ans[i]<arr[j]) ans[i]=arr[j];
//                ans[i]=Math.max(ans[i],arr[j]);
//            }
//        }

        //method 2 best onr loop only
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }

        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }

}
