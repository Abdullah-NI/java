package _18_BinaryTrees;

public class _236_MaxValueNodeInTree {
    static int max=0;
    public static int maxNode(Node root){
//        if(root==null) return Integer.MIN_VALUE;
//         max=Math.max(max,root.val);
//         maxNode(root.left);
//         maxNode(root.right);
//         return max;

        if(root==null) return Integer.MIN_VALUE;
        int a=root.val,b=maxNode(root.left),c=maxNode(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        Node a=new Node(1);          // 1
        Node b=new Node(2);      //2       3
        Node c=new Node(3);   //10   50       7
        Node d=new Node(10); //
        Node e=new Node(50);
        Node f=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        int max=maxNode(a);
        System.out.println(max);
    }
}
