package _08_stringBuilders;

public class _110_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append('z');
        System.out.println(sb);
        sb.append("pqr");
        System.out.println(sb);
        char[] ch={'j','k','l'};
        sb.append(ch);
        System.out.println(sb);
//        int[] in={1,2,3,4};
//        sb.append(in);      // not working addres append ho raha hai
//        System.out.println(sb);
        StringBuilder t = new StringBuilder("xyz");
        sb.append(t);
        System.out.println(sb);
       // sb=sb+"kl";  not possibal


    }
}
