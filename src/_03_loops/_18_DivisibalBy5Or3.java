package _03_loops;

public class _18_DivisibalBy5Or3 {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            if(i%5==0 || i%3==0){
                System.out.println(i);
            }
        }
    }
}
