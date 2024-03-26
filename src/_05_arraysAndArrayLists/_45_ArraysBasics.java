package _05_arraysAndArrayLists;

public class _45_ArraysBasics {
    public static void main(String[] args) {
        int[] arr=new int[5];
        // initializing individual element
        arr[0]=100;
        arr[1]=10;
        arr[2]=50;
        arr[3]=60;
        arr[4]=11;
        // output of arry
        System.out.print(arr[0]+" ");
        System.out.println(arr[1]+" ");

        //update
        arr[1]=1000;
        System.out.println(arr[1]);
    }
}
