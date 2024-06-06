package _08_stringBuilders;

import java.util.Arrays;

public class _114_SortTheString {
    public static void main(String[] args) {
        String s="raghav"; //it can not be sort directly
        char[] ch=s.toCharArray(); // making string to char array
        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();
        // string builder ko sort karna
        StringBuilder sb=new StringBuilder("garg");
        char[] arr =sb.toString().toCharArray();// making string builder to string then it convert into char array
        System.out.println(arr);
        Arrays.sort(arr);
        for(char ele:arr){
            System.out.print(ele);
        }
    }
}
