package _07_String;

import java.util.Scanner;

public class _93_CountAllVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();

//        int count =0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
//                count++;
//            }
//        }
        int n=str.length();
        int count=0;
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);   // char ch=arr[i]
            if(isVowel(ch)==true) count++;
        }
        System.out.println("no of vowels is "+count);
    }

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }
}
