package _11_recursion;

import java.util.Scanner;

public class _156_GenrateBinaryString {
    public static void BinaryString(String ans,int n){
        int m=ans.length();
        if(m==n){
            System.out.println(ans);
            return;
        }
        if(ans=="" || ans.charAt(m-1)=='0'){
            BinaryString(ans+"1",n);     // ya ans+"1"  ki jagha ans+1 and same for zero
            BinaryString(ans+"0",n);
        }
        else BinaryString(ans+"0",n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of string");
        int n=sc.nextInt();
        BinaryString("",n);
    }
}
