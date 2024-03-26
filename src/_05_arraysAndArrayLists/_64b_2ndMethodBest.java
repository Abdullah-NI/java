package _05_arraysAndArrayLists;

public class _64b_2ndMethodBest {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,1,0,1,0,1};
        int n=arr.length;

        int i=0,j=n-1;
        while (i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(arr[i]==1 && arr[j]==0 && i<j){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for( i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
