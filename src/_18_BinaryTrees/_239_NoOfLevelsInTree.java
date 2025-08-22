package _18_BinaryTrees;

public class _239_NoOfLevelsInTree {
    public static int level(Node root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        Node a=new Node(1);          //   1
        Node b=new Node(2);      // 2           3
        Node c=new Node(3);   //10    50     17     7
        Node d=new Node(10); //         13
        Node e=new Node(50);
        Node f=new Node(7);
        Node g=new Node(17);
        Node h=new Node(13);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=g; c.right=f;
        e.right=h;


    }
}
