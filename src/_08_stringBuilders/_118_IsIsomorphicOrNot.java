package _08_stringBuilders;

public class _118_IsIsomorphicOrNot {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(isIsomorphic(s,t));

    }

    public static boolean isIsomorphic(String s, String t) {
        char[] freq=new char[128];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            char dh=t.charAt(i);
            int idx=(int)ch;
            if(freq[idx]=='\0') freq[idx]=dh;

            else{
                if(freq[idx]!=dh) return false;
            }

        }
        for (int i = 0; i < 128; i++) {
            freq[i]='\0';
        }
        for(int i=0;i<t.length();i++){
            char ch =t.charAt(i);
            char dh=s.charAt(i);
            int idx=(int)ch;
            if(freq[idx]=='\0') freq[idx]=dh;

            else{
                if(freq[idx]!=dh) return false;
            }

        }

        return true;
    }
}
