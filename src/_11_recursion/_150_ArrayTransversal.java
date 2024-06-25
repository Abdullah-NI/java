package _11_recursion;

public class _150_ArrayTransversal {
    public static void print(int i,int[] arr ){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr={3,5,27,4,5,78,23};
        int n=arr.length;
        print(0,arr);
    }
}
