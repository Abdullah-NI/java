package _15_linkedList;

public class _190_PrintLinkedList {
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);  // head node
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        Node temp=a;
////        for(int i=1;i<=5;i++){
////            System.out.println(temp.val);
////            temp=temp.next;
////        }
//        while(temp!=null){
//            System.out.println(temp.val);
//            temp=temp.next;
//        }

        //ya function
        print(a);

    }
}
