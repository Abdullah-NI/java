package _15_linkedList;

public class _193_FindMiddelEle {
    // if two middl  ho to 1st middle return karo
    public static Node MiddleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b; //10->20   here we link a and b ie. is we store address of b in a.next
        b.next=c; // 10->20->30
        c.next=d; // 10->20->30->40
        d.next=e; // 10->20->30->40->50


        Node middle=MiddleNode(a);
        System.out.println(middle.val);
    }
}
