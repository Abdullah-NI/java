package _08_stringBuilders;

import java.util.Scanner;

public class _113_ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb =new StringBuilder(sc.nextLine());
        System.out.println(sb);
        int n=sb.length();
        int i=0,j=0;
        while(j<n){
            if(sb.charAt(j)!=' ') j++;
            else {
                Revese(sb,i,j-1);
               i=j+1;
               j=i;
            }
        }
        Revese(sb,i,j-1); //for last word revese
        System.out.println(sb);
    }

    public static void Revese(StringBuilder sb, int i, int j) {
       while(i<=j) {
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
    }
}
