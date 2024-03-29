package _07_String;

public class _102_Interning {
    public static void main(String[] args) {
        String s= "Raghav";
        //if we change Raghav ->madhav
       // s.charAt(0)='m'; Error
       // s.charAt(2)='d';   Error
        s="Madhav";
        System.out.println(s);

        String q="Raghav";
        String a=new String("Raghav");
        System.out.println(a);
    }
}
