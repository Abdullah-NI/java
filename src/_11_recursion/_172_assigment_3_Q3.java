package _11_recursion;

import java.util.ArrayList;

public class _172_assigment_3_Q3 {
    public static ArrayList<String> subString(String s){
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                ans.add(s.substring(i,j));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abcd";
        String t="bcdef";
        ArrayList<String> srr=subString(s);
        ArrayList<String> trr=subString(t);

        System.out.println(srr);
        System.out.println(trr);

        int maxlen=0;
        String maxSubString="";
        for(int i=0;i<srr.size();i++){
            for(int j=0;j< trr.size();j++){
                if(srr.get(i).equals(trr.get(j)) && maxlen<srr.get(i).length()){
                    //maxlen=Math.max(maxlen,srr.get(i).length());
                    maxlen=srr.get(i).length();
                    maxSubString=srr.get(i);
                }
            }
        }
        System.out.println("Commen longest Substring is: "+maxSubString);
        System.out.println("And length is: "+maxlen);
    }
}
