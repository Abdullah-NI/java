package _08_stringBuilders;

import java.util.Scanner;

public class _117_frequencyOfLetter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.next();
        int[] freq =new int[26];
        //0-a,1-b,2-c,....
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=(int)ch-97;   // if char is a then 97-97=0 that is freq[0] ko ++ kara
            freq[idx]++;
        }
        int maxfreq=-1;
        for (int i = 0; i < freq.length; i++) {
            maxfreq=Math.max(maxfreq,freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==maxfreq){
                char ch=(char)(i+97);
                System.out.print(ch+" ");
            }
        }


        // acording to me
//        StringBuilder sb=new StringBuilder(sc.nextLine());
//        int n=sb.length();
//        int max=Integer.MIN_VALUE;
//        char maxchar='0';
//        for(int i=0;i<n;i++){
//            int count=1;
//            if(sb.charAt(i)!='0'){
//                for(int j=i+1;j<n;j++){
//                    if(sb.charAt(i)==sb.charAt(j)){
//                        count++;
//                        sb.setCharAt(j,'0');
//                    }
//                }
//                System.out.print(sb.charAt(i)+"->"+count+" ");
//                if(count>=max) {
//                    max=count;
//                    maxchar=sb.charAt(i);
//                }
//
//            }
//        }
//        System.out.println();
//        System.out.println(maxchar+" is come "+max+" times in the string");
    }
}
