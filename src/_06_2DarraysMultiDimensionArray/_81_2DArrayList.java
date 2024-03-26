package _06_2DarraysMultiDimensionArray;

import java.util.ArrayList;
import java.util.List;

public class _81_2DArrayList {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(10); a.add(20); a.add(30);

        List<Integer> b= new ArrayList<>();
        b.add(40); b.add(50);

        List<Integer> c= new ArrayList<>();

        List<Integer> d= new ArrayList<>();
        d.add(60);

        List<List<Integer>> l =new ArrayList<>();
        l.add(a);  //here we can not store vale here we can store list so add a
        l.add(b);
        l.add(c);
        l.add(d);

        //printing 1d array list
//        System.out.println(a);
//                //OR
//        for(int i=0;i<a.size();i++){
//            System.out.print(a.get(i)+" ");
//        }

//printing 2dArraylist
        //System.out.println(l.get(1).get(1));   //1st row ka 1st element print
        System.out.println(l);
        System.out.println();
                //OR
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i)+" ");
       }
        System.out.println();
                //OR
//        for(int i=0;i<l.size();i++){
//            List<Integer> x=l.get(i);
//            for(int j=0;j<x.size();j++){
//                System.out.print(x.get(j)+" ");
//            }
//            System.out.println();
//        }
    // ya uper wala ese print karo
        for(int i=0;i<l.size();i++){

            for(int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
