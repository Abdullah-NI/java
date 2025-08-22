package _18b_BinarySearchtree;

import java.util.ArrayList;
import java.util.List;

public class _248_PredecessorAndSuccessor {
    public static void inorder(Node root,List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
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

        int key=12;
        List<Integer> arr=new ArrayList<>();
        inorder(a,arr);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==key){
                System.out.println("predecessor of "+key+" is "+arr.get(i-1));
                System.out.println("successer of "+key+" is "+arr.get(i+1));
                break;
            }
        }
    }
}
