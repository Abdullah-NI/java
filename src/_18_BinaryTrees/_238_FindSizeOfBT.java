package _18_BinaryTrees;

public class _238_FindSizeOfBT {   //find no of Node
     static int size=0;
    public static int TreeSize(Node root){
//        if(root==null) return 0;
//        size++;
//        TreeSize(root.left);
//        TreeSize(root.right);
//        return size;

        if(root==null) return 0;
        int leftTS=TreeSize(root.left),  rightTS=TreeSize(root.right);
        return 1+leftTS+rightTS;
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

        int size=TreeSize(a);
        System.out.println(size);
    }
}
