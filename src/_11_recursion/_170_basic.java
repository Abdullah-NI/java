package _11_recursion;

public class _170_basic {
    public static void print(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
            print(n-1);
        }
       // System.out.println();
    }
    public static void main(String[] args) {
        int n=3;
        print(n);
    }
}
