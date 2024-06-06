package _08_stringBuilders;

public class _111_DeletAndInsert {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdefg");
        System.out.println(sb);
        //deliting from a particular index
        sb.deleteCharAt(2);
        System.out.println(sb);  //abdefg
        //deleting from a rang
        sb.delete(2,5);// delet frrom 2 t0 4
        System.out.println(sb);   //abg


        //insert
        sb.insert(2,'j'); // here we can insert int,char,string,bolleanetc
        System.out.println(sb);

    }
}
