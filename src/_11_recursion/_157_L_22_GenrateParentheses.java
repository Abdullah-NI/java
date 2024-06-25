package _11_recursion;

import java.util.Scanner;

public class _157_L_22_GenrateParentheses {

    // acording to me
//    public static void genratepar(String ans,int n){
//        int m=ans.length();
//        if(m==2*n){
//            System.out.println(ans);
//            return;
//        }
//        int nob=0;   //noOfOpeningBracket
//        int ncb=0;   // noOfClosingBracket
//        for(int i=0;i<m;i++){
//            if(ans.charAt(i)=='(') nob++;
//            else ncb++;
//        }
//        if(nob>ncb) {
//            if(nob==n)  genratepar(ans + ")", n);
//            else {
//                genratepar(ans + "(", n);
//                genratepar(ans + ")", n);
//            }
//        }
//        else genratepar(ans + "(", n);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter no of opning Or Closing bracket");
//        int n=sc.nextInt();
//        genratepar("(",n);
//    }

    public static void genratepar(int openB,int closeB,String ans,int n){   //openB=open bracket
        int m=ans.length();
        if(m==2*n){
            System.out.println(ans);
            return;
        }
       if(openB<n) genratepar(openB+1,closeB,ans+"(",n);
       if(closeB<openB) genratepar(openB,closeB+1,ans+")",n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of opning Or Closing bracket");
        int n=sc.nextInt();
        genratepar(0,0,"",n);
    }









}
