package _18_BinaryTrees;

public class _237_MinValueNode {
    public static int minNode(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a=root.val,b=minNode(root.left),c=minNode(root.right);
        return Math.min(a,Math.min(b,c));
    }
    public static void main(String[] args) {
        Node a=new Node(1);          // 1
        Node b=new Node(2);      //2       -3
        Node c=new Node(-3);   //10   50       7
        Node d=new Node(10); //
        Node e=new Node(50);
        Node f=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        int min=minNode(a);
        System.out.println(min);
    }
}
