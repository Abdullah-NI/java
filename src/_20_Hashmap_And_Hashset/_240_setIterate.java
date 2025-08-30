package _20_Hashmap_And_Hashset;

import java.util.HashSet;

public class _240_setIterate {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(20);
        set.add(50);
        set.add(-90);
        set.add(20);
        System.out.println(set.size());
        for(int ele:set){
            System.out.print(ele+" ");
        }
        System.out.println();


        System.out.println(set);
        set.clear();
        System.out.println(set
        );
    }
}
