package _15_linkedList;
//class Node {
//    int val;
//    Node next;   //stating me isme null hai
//    Node(int val){
//        this.val=val;
//    }
//}

public class _195_SinglyCircualLinkedList {
   public static void display(Node head){
//        Node temp=head;
//        do{
//            System.out.print(temp.val+" ");
//            temp=temp.next;
//        }while(temp!=head);
//        System.out.println();

       //ya
       System.out.print(head.val+" ");
       Node temp=head.next;
       while(temp!=head){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
       System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=a;    // change here

        display(a);

    }
}
