package _05_arraysAndArrayLists;

public class _54_PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println(arr[0]);
        //passing to method
       change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) { //(int[] x) bhi likh sakte hai
        arr[0]=90;
    }


}
