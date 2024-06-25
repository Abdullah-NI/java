package _11_recursion;

import java.util.ArrayList;

public class _152_SubsetOfstring {
//    public static void subset(int i,String s,String ans){
//        if(i==s.length()){
//            System.out.println(ans);
//            return;
//        }
//        subset(i+1,s,ans);  //not take
//        subset(i+1,s,ans+s.charAt(i)); //take
//          //OR
////        subset(i+1,s,ans);  //not take
////        ans+=s.charAt(i);
////        subset(i+1,s,ans); //take
//    }
//    public static void main(String[] args) {
//        String s="abc";
//        subset(0,s,"");
//    }

    static ArrayList<String> arr=new ArrayList<>();
    public static void subset(int i,String s,String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        subset(i+1,s,ans);  //not take
        ans+=s.charAt(i);
        subset(i+1,s,ans); //take
    }
    public static void main(String[] args) {
        String s="abc";
        arr=new ArrayList<>();  // reset      jab bhi global variable banate hai to use phele rest kar diya karo
        subset(0,s,"");
        System.out.println(arr);
    }
}
