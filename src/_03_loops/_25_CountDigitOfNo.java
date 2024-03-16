package _03_loops;

import java.util.Scanner;

public class _25_CountDigitOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("No of digit in "+count);
    }
}
