package _03_loops;

public class _24_PridictTheOutput {
    public static void main(String[] args) {
//        int i=10;
//        while(i=10){
//            System.out.println(i);
//            i=i+1;
//        }
//        while('a'<'b')
//            System.out.println("hellow");

        int x=4,y=0;
        while (x>=0){
            x--;
            y++;
            if(x==y) continue;
            else System.out.println(x+" "+y);
        }
    }

}
