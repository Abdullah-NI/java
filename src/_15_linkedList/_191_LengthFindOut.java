package _15_linkedList;

public class _191_LengthFindOut {
    public static int lengthItrative(Node head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
    public static int lengthRecursive(Node head){
        if(head==null) return 0;
        return 1+lengthRecursive(head.next);
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);

        System.out.println("length by Itrative method:  "+lengthItrative(head));
        System.out.println("length by recursive method:  "+lengthRecursive(head));
    }
}
