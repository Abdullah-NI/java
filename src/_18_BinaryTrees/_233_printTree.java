package _18_BinaryTrees;

public class _233_printTree {
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+",");
        display(root.left);  //left sub tree
        display(root.right);  //right sub tree
    }

    public static void main(String[] args) {
        Node a=new Node(1);          //1
        Node b=new Node(2);      //2      3
        Node c=new Node(3);   //4    50       7
        Node d=new Node(4);
        Node e=new Node(50);
        Node f=new Node(7);

        //System.out.println(b.val);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        display(a);   // 1 2 4 50 3 7

        System.out.println();

        Node g=new Node(8);           //1
        Node h=new Node(9);        //2      3
        f.left=g;f.right=h;         //4    50       7
        display(a);                //            8      9
        System.out.println();

        a.left=null;
        display(a);
    }
}
