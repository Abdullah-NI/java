package _08_stringBuilders;

public class _108_ModifieCharacter {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcde");
        System.out.println(sb);

        sb.setCharAt(1,'x');
        System.out.println(sb);
    }
}
