package _11_recursion;

import java.util.Scanner;

public class _162_kthElementInGremer {
    public static int kthsymbol(int n,int k){
        if(n<3)  return k-1;
        int half=(int)Math.pow(2,n-2);
        if(k<=half) return  kthsymbol(n-1,k);
        return kthsymbol(n-1,k-half)==0?1:0;   // ya is line ki jagah niche ki do line
//        if(kthsymbol(n-1,k-half)==0) return 1;
//        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of row");
        int n=sc.nextInt();
        System.out.println("enter kth symbol in that row:");
        int k=sc.nextInt();
        int kthsym=kthsymbol(n,k);
        System.out.println(kthsym);
    }
}
