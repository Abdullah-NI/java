package _18_BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _245_LevelOrderTraversaNextLine {
    //LevelOrder Travers such that every level should be print in next line using quue
    public static class Pair{
        Node node;
        int level;
        public Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void levelOrder(Node root){
        Queue<Pair> q=new LinkedList<>();
        int prevlevel=0;
//        if(root!=null) {
//            Pair p=new Pair(root,0);
//            q.add(p);
//        //ya
        if(root!=null) q.add(new Pair(root,0));  //bcz 0 level
        while(q.size()>0){
            Pair front=q.remove();
            Node temp=front.node;
            int lvl=front.level;
            if(lvl!=prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
             // for next line when level chang
            // if(q.peek()!=null) if(lvl!=q.peek().level) System.out.println();  //ya uper kara ye kaam
        }
    }
    public static void main(String[] args) {
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

        levelOrder(a);



    }
}
