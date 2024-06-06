package _08_stringBuilders;

import java.util.Scanner;

public class _107_StringBuilderInput {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);

       // String s= Sc.nextLine();
      //  StringBuilder sb=new StringBuilder(s);

                    //OR

        StringBuilder sb= new StringBuilder(Sc.nextLine());
        System.out.println(sb);

    }
}
