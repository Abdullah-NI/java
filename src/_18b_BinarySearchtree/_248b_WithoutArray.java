package _18b_BinarySearchtree;

public class _248b_WithoutArray {
    static Node  temp;
    public static void PredSucce(Node root,int key){
        if(root==null) return;
        PredSucce(root.left,key);
        if(root.val==key && temp!=null){
            System.out.println("predecessor of "+key+" is "+temp.val);
        }
        if(temp!=null && temp.val==key){
            System.out.println("successer of "+key+" is "+root.val);
        }
        temp=root;
        PredSucce(root.right,key);
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

        temp=null;
        PredSucce(a,19);



    }
}
