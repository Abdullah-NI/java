package _09_basicSortingAlgorithms;

public class _127_selectionSortByPuttingMaxEleAtEnd {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,5,-7,12,32,3,-6,23,41,};
        print(arr);
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int maxidx=-1;
            for(int j=0;j<n-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxidx=j;
                }
            }
            //swap arr[(n-1)-i] and arr[maxidx]
            int temp=arr[(n-1)-i];
            arr[(n-1)-i]=arr[maxidx];
            arr[maxidx]=temp;
        }
        print(arr);;
    }
}
