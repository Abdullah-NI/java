package _13_OOPS;

public class _184_Constructure {
    public static void main(String[] args) {
        _184_Baalak b1=new _184_Baalak("abcd",56,78.987);    // yaha second constructure kaam kara hai
        System.out.println(b1.name);
        System.out.println(b1.rollNo);
        System.out.println(b1.percentage);
        b1.rollNo=1000000;                        // ya uuper constructure 2 argument wala bhi ban sakte hai aur phir roollno ko seprate initilize kar dege
        System.out.println(b1.rollNo);
        System.out.println(b1.schoolname);


        System.out.println();
        _184_Baalak b2=new _184_Baalak();     //yaha default constructure kaam kara hai
        b2.name="xyz";
        b2.rollNo=5;
        b2.percentage=67;

        System.out.println(b2.name);
        System.out.println(b2.rollNo);
        System.out.println(b2.percentage);


    }
}
