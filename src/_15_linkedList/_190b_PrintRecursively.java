package _15_linkedList;

public class _190b_PrintRecursively {
    public static void print(Node head){

        if(head==null) return;
        System.out.println(head.val);
        print(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(10);  // head node
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        print(a);
    }
}
