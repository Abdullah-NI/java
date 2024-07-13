package _15_linkedList;
//class Node {
//    int val;
//    Node next;   //stating me isme null hai
//    Node(int val){
//        this.val=val;
//    }
//}
class scll {
    Node head;
    Node tail;
    int size;
     void display(){        //yaha chang
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
    void insertAtTail(int val){       //yhaa chang
        Node temp=new Node(val);
        if(head==null) {
            head = tail = temp;  // means head==null list khali hai
            head.next=head;        //yaha
        }
        else{
            tail.next=temp;
            tail=temp;
            tail.next=head;      //yaha
        }
        size++;
    }
    void insertAtHead(int val){      //yaha chang
        Node temp=new Node(val);
        if(head==null) {
            head=tail=temp;
            head.next=head;           //yaha
        }
        else{
            temp.next=head;
            head=temp;
            tail.next=head;        //yaha
        }
        size++;
    }
    void insert(int idx,int val){  //no chang
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
    void deletAtHead() throws Error{    //yaha chang
        if(head==null) throw new Error("List is empty");
        head=head.next;
        tail.next=head;        //yaha
        size--;
    }
    void delet(int idx) throws Error{  //no chang
        if(idx==0){
            deletAtHead();
            return;
        }
        Node temp=head;
        for (int i = 1; i<=idx-1 ; i++) {
            temp=temp.next;
        }
        if(temp.next==tail) {
            tail=temp;
        }
        temp.next=temp.next.next;
        size--;
    }
    int get(int idx) throws Error{    //no chang
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
    void set(int idx,int val) throws Error{  //no chang
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



}

public class _195b_methodImplementationOfSCLL {
    public static void main(String[] args) {
        scll list=new scll();
        list.insertAtTail(10);
       // list.display();
        list.insertAtTail(20);
       // list.display();
        list.insertAtHead(50);
      //  list.display();
        list.insert(2,100);
      //  list.display();
        list.deletAtHead();
      //  list.display();
        list.delet(2);
        list.display();
        System.out.println(list.get(1));
        list.set(0,10000);;
        list.display();

    }
}
