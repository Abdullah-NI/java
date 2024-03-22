
package _05_ArraysAndArrayLists;
import java.util.Scanner;
public class _48_RollNoprint {
    public static void main(String[] args) {
        // if marks less than 35 print the roll no i.e. index
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of arry");
        int n=sc.nextInt();

        int[] arr;
        arr=new int[n];
        System.out.println("Enter marks");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<=n-1;i++){
            if(arr[i]<35) System.out.print(i+" ");
        }
    }
}
