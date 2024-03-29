package _07_String;

import java.util.Scanner;

public class _098_PrintSubStringOfInputString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();


        //only a se banne wali sub string
//        for (int i = 1; i <=s.length() ; i++) {
//            System.out.print(s.substring(0,i)+" ");
//        }

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
