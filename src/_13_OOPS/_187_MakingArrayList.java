package _13_OOPS;

import java.util.Arrays;

public class _187_MakingArrayList {
    public static class ArrayList {
        int[] arr=new int[2];
        int idx=0;
        int size=0;
        public void add(int ele){
            if(size==arr.length){
                int[] brr= Arrays.copyOf(arr,arr.length*2);
                arr=brr;
            }
            arr[idx]=ele;
            idx++;
            size++;
        }
        public int size(){
            return size;
        }
        public void set(int idx,int value){
            arr[idx]=value;
        }

        public void print(){
            System.out.print("[");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+", ");
            }
            System.out.print("]");
        }

    }
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(20);
        arr.add(10);
        System.out.println(arr.size());
        arr.add(100);
        System.out.println(arr.size());

        arr.set(1,3000);
        System.out.println(arr.size());

        arr.print();

    }
}
