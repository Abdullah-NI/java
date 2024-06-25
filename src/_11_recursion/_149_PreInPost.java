package _11_recursion;

public class _149_PreInPost {
    public static void pip(int n){
        if(n==0) return ;
        System.out.print(n+" ");  //pre
        pip(n-1);
        System.out.print(n+" ");  //in
        pip(n-1);
        System.out.print(n+" ");  //post
    }
    public static void main(String[] args) {
        pip(3);
    }

}
