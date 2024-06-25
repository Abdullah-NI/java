package _11_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _160_IncresingSequenceOfLengthK {
   static ArrayList<List<Integer>> l;

   public static void printsequence(ArrayList<Integer> ans,int start,int n,int k){
       if(ans.size()==k){
           System.out.println(ans);
       }
       for (int i = start; i<=n ; i++) {
           ans.add(i);
           printsequence(ans,i+1,n,k);
           ans.remove(ans.size()-1);
       }
   }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter length(k):");
        int k=sc.nextInt();
        System.out.println("enter natural no");
        int n=sc.nextInt();

        l=new ArrayList<List<Integer>>();
        ArrayList<Integer> ans=new ArrayList<>(k);
        printsequence(ans,1,n,k);
    }
}
