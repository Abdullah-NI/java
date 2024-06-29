package _12_mergeAndQuickSorting;

public class _179_Assigment_2_Q3 {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3,8,6,7,5,9,10};
        print(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[i+1] && arr[j]<arr[j-1]) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                break;
            }
            else if(arr[i]<arr[i+1]) i++;
            else j--;
        }
        print(arr);
    }
}
