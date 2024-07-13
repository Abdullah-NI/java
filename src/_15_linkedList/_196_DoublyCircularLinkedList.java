package _15_linkedList;
//class dNode {
//    int val;
//    dNode next;
//    dNode prev;
//    dNode(int val){
//        this.val=val;
//    }
//}


public class _196_DoublyCircularLinkedList {
    public static void printStart(dNode head){
        System.out.print(head.val+" ");
        dNode temp=head.next;
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        System.out.print(tail.val+" ");
        dNode temp=tail.prev;
        while(temp!=tail){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp=node;
        while(temp.prev!=tail){
            temp=temp.prev;
        }
        // now temp is become head
        printStart(temp);
    }
    static dNode tail;
    public static void main(String[] args) {
        dNode a=new dNode(10);
        dNode b=new dNode(20);
        dNode c=new dNode(30);
        dNode d=new dNode(40);
        a.next=b;  b.prev=a;
        b.next=c;  c.prev=b;
        c.next=d;  d.prev=c;
        d.next=a;  a.prev=d;
        tail=d;

        printStart(a);
       printReverse(d);
        display(c);
    }
}
