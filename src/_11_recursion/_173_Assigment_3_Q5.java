package _11_recursion;
public class _173_Assigment_3_Q5 {
   static String ans="";
    public static String decToBinary(int n){
        if(n==1){
            ans+=1;
            return ans;
        }
        decToBinary(n/2);
        if(n%2==0) ans+=0;
        else ans+=1;
       return ans;
    }
    public static void main(String[] args) {
        int n=234;
       String s= decToBinary(n);
        System.out.println(s);
    }
}
