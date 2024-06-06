package _08_stringBuilders;

public class _106_StringBuilderBasic {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("abc");
        // Or
//        String r="abc";
//        StringBuilder sb= new StringBuilder(r);
        //StringBuilder sc="adc"; //not valid
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
      //  System.out.println(sb.reverse());


        StringBuilder a= new StringBuilder();  // emty StringBuilder
                    //OR
        StringBuilder b=new StringBuilder("");  // by defalt capacity 16 hoti hai
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.capacity());

        StringBuilder c= new StringBuilder(10);
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(c.capacity());
    }
}
