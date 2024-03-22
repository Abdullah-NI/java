package _05_ArraysAndArrayLists;

public class _50_SumOfArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,5};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
