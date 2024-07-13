package _15_linkedList;

class Node {
    int val;
    Node next;   //stating me isme null hai
    Node(int val){
        this.val=val;
    }
}

public class _188_ListNodeClass {
    public static void main(String[] args) {
        Node a=new Node(10);  // head node
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        // if we print System.out.println(a ya b ya c );  give adress of that node
        // if we print System.out.println(a.next ya b.next ya c.next); give  null
        a.next=b; //10->20   here we link a and b ie. is we store address of b in a.next
        b.next=c; // 10->20->30
        c.next=d; // 10->20->30->40
        d.next=e; // 10->20->30->40->50

        //print
//        System.out.println(a.val);
//        System.out.println(b.val);
//        System.out.println(c.val);
//        System.out.println(d.val);
//        System.out.println(e.val);

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);

       // Node temp=a;
        Node temp=new Node(10);

        System.out.println(a);
        System.out.println(temp);



    }
}
