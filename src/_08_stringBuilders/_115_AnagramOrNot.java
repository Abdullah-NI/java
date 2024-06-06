package _08_stringBuilders;

import java.util.Arrays;

public class _115_AnagramOrNot {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        char[] ch1=s.toCharArray();
        Arrays.sort(ch1);
        char[] ch2=t.toCharArray();
        Arrays.sort(ch2);


//        s=Arrays.toString(ch1);
//        t=Arrays.toString(ch2);
//        if(s.equals(t)) return true;
//        else    return false;

        //ya uper ki char line ki jagha
        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i]!=ch2[i]) return  false;
        }
        return true;



    }
}
