package _20_Hashmap_And_Hashset;

import java.util.HashSet;

public class _239_basics {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        // insert TC=O(1)
        set.add(100);
        set.add(20);
        set.add(40);
        set.add(-19);
        System.out.println(set); //tc=0(n)

//        TC=O(1)
        System.out.println(set.contains(100));

        System.out.println(set.size());

        set.remove(20);
        System.out.println(set);


        //removeming of  not exits elelmetn not give error
        set.remove(10000);
        System.out.println(set);

        Object[] arr=set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
