package _18_BinaryTrees;

public class _234_FindSumOfTreeNode {
    //static int  sum=0;
    public static int sum(Node root){
//        if(root==null) return sum;
//        sum=sum+root.val;
//        sum(root.left);
//        sum(root.right);
//        return sum;

        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);

        //int leftsum=sum(root.left),rightsum=sum(root.right);
        // return root.val+leftsum+rightsum;
    }
    public static void main(String[] args) {
        Node a=new Node(1);          // 1
        Node b=new Node(2);      //2       3
        Node c=new Node(3);   //4    50       7
        Node d=new Node(4); //
        Node e=new Node(50);
        Node f=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        int x=sum(a);
        System.out.println("sum of tree node is "+x);
    }
}
