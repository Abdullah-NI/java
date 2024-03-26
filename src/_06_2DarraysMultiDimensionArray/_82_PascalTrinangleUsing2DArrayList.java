package _06_2DarraysMultiDimensionArray;

import java.util.ArrayList;
import java.util.List;

public class _82_PascalTrinangleUsing2DArrayList {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=5;

        // method 1 to fill array list

             // fill all arrylist with 1
//        for(int i=0;i<n;i++){
//            List<Integer> l=new ArrayList<>();
//            for(int j=0;j<=i;j++){
//                l.add(1);
//            }
//            ans.add(l);
//        }
//           // modifi required index
//        for(int i=2;i<n;i++){
//            for(int j=1;j<=i-1;j++){
////                int res=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
////                ans.get(i).set(j,res);
//                ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
//
//            }
//        }


        //method 2
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
               if(j==0 || j==i) l.add(1);
               else{
                   l.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
               }
            }
            ans.add(l);
        }

        //print
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
