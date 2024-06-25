package _11_recursion;
import java.util.Scanner;
public class _145_AtoThePowerB {
    public static int power(int a,int b){
        if(b==0) return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre base :");
        int a=sc.nextInt();
        System.out.println("enter power :");
        int b=sc.nextInt();
        if(a==0 &&  b==0) System.out.println("not define");
        else System.out.println(a+" rais to the power "+b+" is "+power(a,b));

    }
}
