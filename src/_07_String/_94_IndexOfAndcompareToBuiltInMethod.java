package _07_String;

public class _94_IndexOfAndcompareToBuiltInMethod {
    public static void main(String[] args) {
        String s="Raghav Garg";
        System.out.println(s.indexOf('r'));
        System.out.println(s.indexOf('a'));   //first a ka index dega
        System.out.println(s.indexOf('z'));
        System.out.println(s.lastIndexOf('a'));  //last a ka index dega

        System.out.println();

        String a1="abc";
        String b1="dbc";
        System.out.println(a1.compareTo(b1));   // a-d ki asci value ka diff i.e -3

        String a2="adc";
        String b2="abc";
        System.out.println(a2.compareTo(b2));  // d-b ki ascii value ka diff i.e. 2

        String a3="abc";
        String b3="abc";
        System.out.println(a3.compareTo(b3));  // 0 because all character is same

        String a4="abcggg";
        String b4="abc";
        System.out.println(a4.compareTo(b4));  //3 because 3 extra char in a so +ve

        String a5="abc";
        String b5="abcttttt";
        System.out.println(a5.compareTo(b5));  //-5 because 5 extra char in b so -ve


    }


}
