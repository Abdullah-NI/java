package _18b_BinarySearchtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _248cAnotherApproch {
    // jab predesser and succer root ke niche wale level me ho
    public static void PredSucce(Node root,int key){
        Node pred=root.left;
        while(pred.right!=null){
            pred=pred.right;
        }
        System.out.println("predecessor of "+key+" is "+pred.val);

        Node succe=root.right;
        while(succe.left!=null){
            succe=succe.left;
        }
        System.out.println("predecessor of "+key+" is "+succe.val);
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


        PredSucce(a,10);


        
    }
}
