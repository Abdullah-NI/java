package _11_recursion;

public class _141_Basics {
//    public static void banana(){
//        System.out.println("i am in banana");
//    }
//    public static void apple(){
//        System.out.println("i am in apple method");
//        banana();
//    }
//    public static void main(String[] args) {
//        System.out.println("I am in main method");
//        apple();
//    }

    public static void mango(){
        System.out.println("i am in mango");

    }
    public static void banana(){
        mango();
        System.out.println("i am in banana");
    }
    public static void apple(){
        banana();
        System.out.println("i am in apple method");
        mango();


    }
    public static void main(String[] args) {
        System.out.println("I am in main method");
        apple();
        System.out.println("now finish");

    }
}
