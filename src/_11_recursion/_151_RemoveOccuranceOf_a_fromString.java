package _11_recursion;

public class _151_RemoveOccuranceOf_a_fromString {
    public static void skip(int i,String s,String ans){
        if(i==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a') ans+=s.charAt(i);
        skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s="Raghav Garg";
        System.out.println(s);
        skip(0,s,"");
    }
}
