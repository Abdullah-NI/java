package _18b_BinarySearchtree;

//import _18_BinaryTrees.Node;

class Node{  //ya TreeNode
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}


public class _246_MinAndMaxValueNodeInBST {
//    static  int max;
//    static  int min;
    public static int minval(Node root){
        if(root==null) return Integer.MAX_VALUE;
       int a=root.val;
        int b=minval(root.left);   //YE BST hai isliye min left me hi hoga
        return Math.min(a,b);   //aur hamne yaha max fun me pass nhi karwaye if karwate to Integer.MAX_VALUE hi de raha chuki ye by value pass hota hai not by refrence
    }
    public static int maxval(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a=root.val;
        int b=maxval(root.right);//YE BST hai isliye max right me hi hoga
        return Math.max(a,b);   //aur hamne yaha max fun me pass nhi karwaye if karwate to 10 hi de raha chuki ye by value pass hota hai not by refrence
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

         int max=maxval(a);
         System.out.println(max);

         int  min=minval(a);
         System.out.println(min);

    }
}
