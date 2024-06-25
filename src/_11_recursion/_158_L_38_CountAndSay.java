package _11_recursion;

import java.util.Scanner;

public class _158_L_38_CountAndSay {

    public static String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        //now we have to modify s
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int lenth=j-i;
                ans+=lenth;
                ans+=s.charAt(i);
                i=j;
            }
        }
        // last wale charcter ke liye ye three line
        int lenth=j-i;   //ya in three lines ki jagha uper iski {String s=countAndSay(n-1);}  jagha
        ans+=lenth;      // ye likho String s=countAndSay(n-1)+"@";  any character exept no.jisse string
        ans+=s.charAt(i);   // ki length 1 extra ho jaygi to fir ye three line ye likhne ki jarorat nhi hai

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        String modified=countAndSay(n);
        System.out.println(modified);
    }
}
