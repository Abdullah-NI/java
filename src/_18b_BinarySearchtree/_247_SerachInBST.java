package _18b_BinarySearchtree;

import java.util.Arrays;
import java.util.Scanner;

public class _247_SerachInBST {
    public static boolean search(Node root,int target){
        if(root==null) return false;
        if(root.val==target) return true;
        else if(root.val>target) return search(root.left,target);
        else return search(root.right,target);
    }
    public static void main(String[] args) {
        Node a=new Node(10);          // 10
        Node b=new Node(5);      // 5         15
        Node c=new Node(15);   //2    8    12     19
        Node d=new Node(2); //
        Node e=new Node(8);
        Node f=new Node(12);
        Node g=new Node(19);


        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        System.out.println("enter value which you want to search");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        boolean flag=search(a,target);
        if(flag==true) System.out.println("find");
        else System.out.println("not found");



    }
}
