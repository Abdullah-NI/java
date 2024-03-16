package _03_loops;

public class _22_Continue {
    public static void main(String[] args) {

//        // 100 iteretion
//        for(int i=1;i<100;i++){
//            if(i%2!=0) System.out.println(i);
//        }
//
//        // 50 iteretion
//        for(int i=1;i<100;i+=2){
//            System.out.println(i);
//        }

        // 100 iteretion
        for(int i=1;i<100;i++){
            if(i%2==0) continue;
            System.out.println(i);
        }
    }
}
