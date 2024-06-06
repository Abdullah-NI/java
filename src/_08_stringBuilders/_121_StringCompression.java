package _08_stringBuilders;

public class _121_StringCompression {
    public static void main(String[] args) {

        // with use of stringbuilder
        String s="aaaabbcddeffggg";
        char[] arr=s.toCharArray();
        System.out.println(arr);
        StringBuilder ans =new StringBuilder("");
        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else {
                ans.append(arr[i]);
                int len=j-i;
                if(len>1) ans.append(len);
                i=j;
            }
        }
        ans=ans.append(arr[i]);
        int len=j-i;
        if(len>1) ans.append(len);
        System.out.println(ans);


   // with use of string

//        String s="aaaabbcddeffggg";
//        char[] arr=s.toCharArray();
//        System.out.println(arr);
//        String ans="";
//        int i=0,j=1;
//        while(j<arr.length){
//            if(arr[i]==arr[j]) j++;
//            else {
//                ans=ans+arr[i];
//                int len=j-i;
//                if(len>1) ans+=len;
//                i=j;
//            }
//        }
//        ans=ans+arr[i];
//        int len=j-i;
//        if(len>1) ans+=len;
//        System.out.println(ans);


           //without use of char array
//        String s="aaaabbcddeffggg";
//        System.out.println(s);
//        String ans="";
//        int i=0,j=1;
//        while(j<s.length()){
//            if(s.charAt(i)==s.charAt(j)) j++;
//            else {
//                ans=ans+s.charAt(i);
//                int len=j-i;
//                if(len>1) ans+=len;
//                i=j;
//            }
//        }
//        ans=ans+s.charAt(i);
//        int len=j-i;
//        if(len>1) ans+=len;
//        System.out.println(ans);
    }
}
