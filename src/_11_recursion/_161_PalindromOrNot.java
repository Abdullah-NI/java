package _11_recursion;

import java.util.Scanner;

public class _161_PalindromOrNot {
    public static boolean ispalindrom(String s,int strt,int end){
        if(s.charAt(strt)!=s.charAt(end)) return false;
        if(strt>end) return true;
        return ispalindrom(s,strt+1,end-1);

    }
    public static void main(String[] args) {
        String s="madam";
        System.out.println(ispalindrom(s,0,s.length()-1));
    }
}
