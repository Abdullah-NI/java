package _18_BinaryTrees;

import java.util.Scanner;

public class _244_LevelOdertranvesalusigDFS {
    // eans level order traversal wiout que yaha bhi ham DFS method use predor ,inOrder Postorder
    static int n;
    public static void nthlevel(Node root,int level){  ////preorder wala code  chahe inOrder ya PostOrder ka Code likho
        if(root==null) return;           //if han yaha left right uper niche likh dege to rever me travasal hoa means every level reverse print hoga
        if(level==n) System.out.print(root.val+",");
        nthlevel(root.left,level+1);
        nthlevel(root.right,level+1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Node a=new Node(1);          //1
        Node b=new Node(2);      //2      3
        Node c=new Node(3);   //4    5  6    7
        Node d=new Node(4);//                   8
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        g.right=h;

        for(int i=0;i<=3;i++){
            n=i; //curent ka jo level print karana hai isliye i dal   ya ise bhi fuction me ppass kara do
            nthlevel(a,0);
            System.out.println();

        }
    }
}
