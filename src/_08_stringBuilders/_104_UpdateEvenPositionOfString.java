package _08_stringBuilders;

import java.util.Scanner;

public class _104_UpdateEvenPositionOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string");
        String s=sc.nextLine();
        System.out.println(s);
        String str="";
        for(int i=0;i<s.length();i++){
            if(i%2==0) str+='a';
            else str+=s.charAt(i);
        }
        s=str;
        System.out.println(s);
    }
}
