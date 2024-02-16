package _01_basics;

import java.util.Scanner;

public class _04b_AreaOfCirleInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("entre radius of circle");
        double r=sc.nextDouble();
        double a =3.141592*r*r;
        System.out.println(a);
    }
}
