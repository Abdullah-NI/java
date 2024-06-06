package _08_stringBuilders;

import java.util.Scanner;

public class _109_ToggelAllCharOfString {
    public static void main(String[] args) {
        // means capital later ko small and small later ko capital bana do
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        StringBuilder sb =new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            int ascii=(int)sb.charAt(i);
            if(ascii>=65 && ascii<=90) sb.setCharAt(i,(char)(ascii+32));
            else if(ascii>=97 && ascii<=122) sb.setCharAt(i,(char)(ascii-32));
        }
        System.out.println(sb);
    }
}
