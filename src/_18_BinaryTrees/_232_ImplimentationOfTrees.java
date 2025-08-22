package _18_BinaryTrees;

class Node{  //ya TreeNode
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class _232_ImplimentationOfTrees {
    public static void main(String[] args) {
        Node a=new Node(1);          //1
        Node b=new Node(2);      //2      3
        Node c=new Node(3);   //4    5       7
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        //System.out.println(b.val);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        System.out.println(a.val);
        System.out.println(a.left.val);

        System.out.println(e.val);
        System.out.println(a.left.right.val);  //e hi hai ye bhi

        a.left.right.val=67;  //e.val
        System.out.println(e.val);
        System.out.println(a.left.right.val);

    }
}
