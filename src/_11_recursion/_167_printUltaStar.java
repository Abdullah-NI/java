package _11_recursion;

public class _167_printUltaStar {
    public static void printrow(int n,int i,int j){
        if(j>n+1-i) return;
        System.out.print("* ");
        printrow(n,i,j+1);
    }
    public static void printstar(int n,int i){
        if(i>n) return;
        printrow(n,i,1);
        System.out.println();
        printstar(n,i+1);
    }
    public static void main(String[] args) {
       // int[] arr={5,4,3,2,1};
        int n=9;
        printstar(n,1);

    }
}
