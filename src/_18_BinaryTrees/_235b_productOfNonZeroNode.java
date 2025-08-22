package _18_BinaryTrees;

public class _235b_productOfNonZeroNode {
    public static int pro(Node root){
        if(root==null ) return 1;
        if(root.val==0) return 1*pro(root.left)*pro(root.right);
        return root.val*pro(root.left)*pro(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);          // 1
        Node b=new Node(2);      //2       0
        Node c=new Node(0);   //4    0         7
        Node d=new Node(4); //
        Node e=new Node(0);
        Node f=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        int p=pro(a);
        System.out.println(p);
    }
}
