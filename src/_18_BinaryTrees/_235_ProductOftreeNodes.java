package _18_BinaryTrees;

public class _235_ProductOftreeNodes {
    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);          // 1
        Node b=new Node(2);      //2       3
        Node c=new Node(3);   //4    5         7
        Node d=new Node(4); //
        Node e=new Node(5);
        Node f=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        int p=product(a);
        System.out.println(p);

    }
}
