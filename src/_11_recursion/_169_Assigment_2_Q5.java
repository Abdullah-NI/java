package _11_recursion;

public class _169_Assigment_2_Q5 {
    public static void reverse(int n,long ans){
        if(n==0) {
            System.out.println(ans);
            return;
        }
        int ld=n%10;
        ans=ans*10+ld;
        reverse(n/10,ans);
    }
    public static void main(String[] args) {
        int n=2147483647;
        long ans=0;
        reverse(n,ans);
    }
}
