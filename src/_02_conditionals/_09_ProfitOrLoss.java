package _02_conditionals;

import java.util.Scanner;

public class _09_ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter cost price");
        int cp=sc.nextInt();
        System.out.print("Enter sell price");
        int sp=sc.nextInt();

        if(cp<sp) {
            System.out.println("profit is :");
            System.out.println(sp-cp);
        }
         if(cp>sp) System.out.println("loss is :"+(cp-sp));
        if(cp==sp) System.out.println("no profit no loss");
    }
}
