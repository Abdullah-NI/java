package _03_loops;

import java.util.Scanner;

public class _25_SumOfDigitOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }
        System.out.println("The sum is : "+sum);
    }
}
