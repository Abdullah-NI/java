package _05_arraysAndArrayLists;


import java.util.ArrayList;

public class _59_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(6);
        arr.add(0,10); //arr[0=10;
        arr.add(1,20);  //initilization
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);

        System.out.println(arr.size());

        System.out.println(arr);           // print arry list like [10,20,30,40,50]
//        for(int i=0;i<arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
        arr.set(2,2500);             // modification
        System.out.println(arr);

        arr.add(700);              //push back
        System.out.println(arr.size());
        System.out.println(arr);






    }
}
