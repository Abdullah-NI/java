package _05_ArraysAndArrayLists;

import java.util.ArrayList;

public class _60_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println(list+"  size is "+list.size());
        list.add(60);
        System.out.println(list+"  size is "+list.size());
        list.add(40);
        System.out.println(list+"  size is "+list.size());
        list.add(56);
        System.out.println(list+"  size is "+list.size());
        list.add(13);
        System.out.println(list+"  size is "+list.size());
        list.remove(1);
        System.out.println(list+"  size is "+list.size());
    }
}
