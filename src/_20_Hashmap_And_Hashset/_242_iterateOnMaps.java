package _20_Hashmap_And_Hashset;

import java.util.Arrays;
import java.util.HashMap;

public class _242_iterateOnMaps {
    public static void main(String[] args) {

        System.out.println();
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Raghav",76);
        map.put("Himanshu",83);
        map.put("anritnashu",13);
        map.put("ayushi",82);
        map.put("prachi",83);

        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());



        for(String key:map.keySet()){
            int val=map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();


        for(int val:map.values()){
            System.out.println(val);
        }
        System.out.println();

        for (Object pair:map.entrySet()){
            System.out.println(pair);
        }
    }
}
