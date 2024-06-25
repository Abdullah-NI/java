package _11_recursion;

public class _166_Assigment_2_Q2 {
    public static void find(int[] arr,int target,int i){
        if(i==arr.length){
            System.out.println(-1);return;
        }
        if(arr[i]==target) {
            System.out.println(i);
            return;
        }
        find(arr,target,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,2,6};
        int target=6;
        find(arr,target,0);
    }
}
