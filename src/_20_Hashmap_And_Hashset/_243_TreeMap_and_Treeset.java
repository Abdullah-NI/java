package _20_Hashmap_And_Hashset;

import java.util.TreeMap;
import java.util.TreeSet;

public class _243_TreeMap_and_Treeset {
    public static void main(String[] args) {
        //treeset
        TreeSet<Integer> set=new TreeSet<>();
        set.add(100);
        set.add(20);
        set.add(40);
        set.add(-19);
        System.out.println(set);


        //treemap
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("Raghav",76);
        map.put("bimanshu",83);
        map.put("anritnashu",13);
        map.put("ayushi",82);
        map.put("prachi",88);
//        System.out.println(map);
        for(String key:map.keySet()){
            int val=map.get(key);
            System.out.println(key+" "+val);
        }
    }

}
