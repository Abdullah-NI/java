package _05_arraysAndArrayLists;

import java.util.Scanner;

public class _51_LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter target element");
        int x=sc.nextInt();
        System.out.print("enter size of arry ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         boolean flag=false;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                flag=true;
                break;
            }
        }
       if(flag==false) System.out.println("element not found");
       else System.out.println("element found");
    }
}
