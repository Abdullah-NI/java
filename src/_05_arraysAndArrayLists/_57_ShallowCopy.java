package _05_arraysAndArrayLists;

public class _57_ShallowCopy {
    public static void main(String[] args) {
        int[] arr ={30,40,50,60};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums =arr;  //shallow copy

        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();

        nums[0]=1000;
        System.out.println(arr[0]);  // here output should come 30 but we get 1000 due to shallow copy

    }
}
