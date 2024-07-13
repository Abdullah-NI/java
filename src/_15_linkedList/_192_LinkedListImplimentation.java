package _15_linkedList;

class SLL{  // singly linked list //user define data structure
   private Node head;    // starting per head and tail null per hai
   private Node tail;
   private int size;          //by default value zero
    void insertAtTail(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;  // means head==null list khali hai
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("The length of list is: "+size);
    }
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void insert(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("invalid index");
            return;
        }
        Node temp=new Node(val);
        Node x=head;   //temparary node
        for(int i=1;i<=idx-1;i++){
            x=x.next;
        }
        //insertion part
        temp.next=x.next;
        x.next=temp;
        size++;
    }

    int get(int idx) throws Error{
        if(idx==size-1) return tail.val;      // chahe ye na likho cover ho jayga
        if(idx>=size || idx<0) {
//            System.out.println("Invalid index");
//            return 0;
            throw new Error("Invalid index hai");
        }
        Node temp =head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val) throws Error{
       // if(idx==size-1) tail.val=val;    // chahe ye na likho cover ho jayga
        if(idx>=size || idx<0){
            throw new Error("Invalid index");
        }
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        temp.val=val;
    }
    void deletAtHead() throws Error{
        if(head==null) throw new Error("List is empty");
        head=head.next;
        size--;
    }
    void delet(int idx) throws Error{
        if(idx==0){
            deletAtHead();
            return;
        }
      Node temp=head;
        for (int i = 1; i<=idx-1 ; i++) {
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }

}

public class _192_LinkedListImplimentation {
    public static void main(String[] args) {
        SLL list =new SLL();
        //System.out.println(list.size);
        //ya
        list.size();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.size();

        list.insertAtHead(10000);
        list.display();

        list.insert(2,90);
        list.display();

        System.out.println(list.get(3));

        list.set(2,500);
        list.display();

        list.deletAtHead();
        list.display();

        list.delet(3);
        list.display();
    }
}
