package _18_BinaryTrees;

public class _241_TreeTransversalPreorderInorderPostorder {
    public static void preorderdisplay(Node root){
        if(root==null) return;
        System.out.print(root.val+",");
        preorderdisplay(root.left);  //left sub tree
        preorderdisplay(root.right);  //right sub tree
    }
    public static void  inorderdisplay(Node root){
        if(root==null) return;
        inorderdisplay(root.left);  //left sub tree
        System.out.print(root.val+",");
        inorderdisplay(root.right);  //right sub tree
    }
    public static void  postorderdisplay(Node root){
        if(root==null) return;
        postorderdisplay(root.left);  //left sub tree
        postorderdisplay(root.right);  //right sub tree
        System.out.print(root.val+",");
    }
    public static void main(String[] args) {
        Node a=new Node(1);          //1
        Node b=new Node(2);      //2      3
        Node c=new Node(3);   //4    5  6    7
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;

        System.out.print("preorder: ");
        preorderdisplay(a);

        System.out.println();

        System.out.print("inoreder: ");
        inorderdisplay(a);

        System.out.println();

        System.out.print("postOrder: ");
        postorderdisplay(a);
    }
}
