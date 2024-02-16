package _02_conditionals;

import java.util.Scanner;

public class _09b_AreaParamiterWhichGreter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter length and breath of rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int a=l*b;
        int p=2*(l+b);

        if(a>p) System.out.println("Area is gretaet :"+a);
        if(a<p) System.out.println("Parameter is greater: "+p);
        if (a==p) System.out.println("area and paraneter is equal "+a+" "+p);
    }
}
