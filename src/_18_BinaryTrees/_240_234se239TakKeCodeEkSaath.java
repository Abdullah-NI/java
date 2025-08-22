package _18_BinaryTrees;

public class _240_234se239TakKeCodeEkSaath {
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+",");
        display(root.left);  //left sub tree
        display(root.right);  //right sub tree
    }

    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }

    public static int maxNode(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a=root.val,b=maxNode(root.left),c=maxNode(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int minNode(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a=root.val,b=minNode(root.left),c=minNode(root.right);
        return Math.min(a,Math.min(b,c));
    }
    public static int TreeSize(Node root){
        if(root==null) return 0;
        int leftTS=TreeSize(root.left),  rightTS=TreeSize(root.right);
        return 1+leftTS+rightTS;
    }
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

        display(a);
        System.out.println();
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(maxNode(a));
        System.out.println(minNode(a));
        System.out.println(TreeSize(a));
        System.out.println(level(a));
    }
}
