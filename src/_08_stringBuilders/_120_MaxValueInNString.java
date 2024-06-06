package _08_stringBuilders;

public class _120_MaxValueInNString {
    public static void main(String[] args) {

        //for limited case not for every case
//        String[] arr={"829744444","756","8974"};
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//           int n=Integer.parseInt(arr[i]);
//           max=Math.max(max,n);
//        }
//        System.out.println(max);

        String[] arr ={"86957648475855","7465485","86575","0000000435343534353"};
        String maxS=arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxS=Max(maxS,arr[i]);
        }
        System.out.println(maxS);


    }

    public static  String Max(String a,String b) {
       String s=purify(a); String t=purify(b);
       if(s.length()>t.length()) return a;
       if(t.length()>s.length()) return b;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i)){
            if(s.charAt(i)>t.charAt(i)) return a;
            else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }

    private static String purify(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}
