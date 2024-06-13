package _09_basicSortingAlgorithms;

public class _129_TransFormArray {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //array is given with N distinct element put0 at place of smallest element then put 1 in place of second smallest element
        int[] arr={54,11,28,47,91,63};
        print(arr);
        int n=arr.length;
        int x=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    minidx=j;
                }
            }
            arr[minidx]=x;
            x--;
        }
        print(arr);
        for(int i=0;i<n;i++){
            arr[i]*=-1;
        }

        print(arr);

    }
}
