package _03_loops;

import java.util.Scanner;

public class _19_TableOfN {
    public static void main(String[] args) {
//        for(int i=19;i<=190;i++){
//            if(i%19==0) System.out.println(i);
//        }
//        for(int i=19;i<=190;i+=19){
//            System.out.println(i);

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i<=10*n;i+=n){
             System.out.println(i);
        }
    }
}
