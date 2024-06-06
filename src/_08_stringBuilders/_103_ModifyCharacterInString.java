package _08_stringBuilders;

public class _103_ModifyCharacterInString {
    public static void main(String[] args) {
       String s="hello";
       //heylo
        //2nd index ko chang to y   // bakar method here time and space jayada laga
        s=s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);
    }
}
