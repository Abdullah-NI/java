package _20_Hashmap_And_Hashset;

import java.util.HashMap;

public class _241_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Raghav",76);
        map.put("Himanshu",83);
        map.put("anritnashu",13);
        map.put("ayushi",82);
        map.put("prachi",88);
        System.out.println(map+" "+map.size());

//        map.put("Raghav",100);
//        System.out.println(map);

        map.put("Harish",76);
        System.out.println(map+" "+map.size());

        System.out.println(map.containsKey("Raghav"));
        System.out.println(map.containsValue(76));

        map.remove("Harish");
        System.out.println(map+" "+map.size());;

        System.out.println(map.get("Raghav"));

        HashMap<Integer,Integer> map2=new HashMap<>();
        map2.put(1,23);
        map2.put(4,56);
        System.out.println(map2);

    }
}
