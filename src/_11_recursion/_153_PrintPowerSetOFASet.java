package _11_recursion;

import java.util.ArrayList;
import java.util.List;

public class _153_PrintPowerSetOFASet {
    static List<List<Integer>> lrr;
    public static void subset(int i,int[] arr,ArrayList<Integer> ans){
        if(i==arr.length){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<ans.size();j++){          // make copy of ans chuki last me hamne element remove kar diya hai esa isliye kara kiyuki arrylist pass by refrence hoti hai
                list.add(ans.get(j));
            }
            lrr.add(list);
            return;
        }
        subset(i+1,arr,ans);  //no take
         ans.add(arr[i]);
        subset(i+1,arr,ans);  //take
        ans.remove(ans.size()-1);   //last index se element remove kara  chuki ye pass by refrence hoti hai
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        lrr=new ArrayList<>();  // global vARIBLE ISLIYE RESET KARA
        ArrayList<Integer> ans=new ArrayList<>();   //empty list
        subset(0,arr,ans);
        System.out.println("power set is: "+lrr);
    }
}
