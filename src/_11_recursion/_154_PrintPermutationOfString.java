package _11_recursion;

public class _154_PrintPermutationOfString {
    public static void permutation(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            String left= s.substring(0,i);  // 0 to i-1 tak ki string
            String right=s.substring(i+1);   // i+1 se aage tak ki string
            permutation(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        String s ="abc";
        permutation("",s);
    }
}
