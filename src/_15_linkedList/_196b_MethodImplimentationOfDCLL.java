package _15_linkedList;
//class dNode {
//    int val;
//    dNode next;
//    dNode prev;
//    dNode(int val){
//        this.val=val;
//    }
//}
    class dcll {
    dNode head;
    dNode tail;
    int size;
     void display() throws Error{
         if(head==null) throw new Error("list IS empty");
        System.out.print(head.val+" ");
        dNode temp=head.next;
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){         //yaha chang
        dNode temp=new dNode(val);
        if(size==0) {
            head=tail=temp;
            head.next=head;          //yaha
            head.prev=head;         //yaha
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=tail.next;

            tail.next=head;       //yaha
        }
        size++;
    }
    void insertAtHead(int val){        //yaha chang
        dNode temp=new dNode(val);
        if(size==0) {
            head=tail=temp;
            head.next=head;              //yaha
            head.prev=head;         //yaha
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;

            head.prev=tail;          //yaha
            tail.next=head;     //important chang
        }
        size++;
    }
    void insertAtIndex(int idx,int val) throws Error{   //no chang
        if(idx==0) {
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx<0 || idx>size) {
            throw new Error("invalid idx");
        }
        dNode x=head;
        for (int i = 1; i <=idx-1 ; i++) {
            x=x.next;
        }
        dNode y=x.next;
        dNode temp=new dNode(val);
        x.next=temp;   temp.prev=x;
        y.prev=temp;   temp.next=y;
        size++;
    }
    void deletAtHead() throws Error{        //chang
        if(size==0) throw new Error("List is empty");
        head=head.next;
        head.prev=tail;      //yaha
        tail.next=head;      //yaha

        size--;
    }
    void deletAtTAil(){           //yaha chang
        tail=tail.prev;   // yaha
        tail.next=head; //yaha
        head.prev=tail;
        size--;
    }
    void deletAtIndex(int idx) throws Error{     //no chang
        if(idx==0){
            deletAtHead();
            return;
        }
        if(idx==size-1){
            deletAtTAil();
            return;
        }
        if(idx<0 || idx>=size) throw new Error("Invalid index");
        dNode temp=head;
        for (int i = 1; i <=idx-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp=temp.next;
        temp.prev=temp.prev.prev;
        size--;
    }
    int get(int idx) throws Error{      //no chang
        if(size==0) throw new Error("list is empty");
        //  if(idx==size-1) return tail.val;
        if(idx<0 || idx>=size) throw new Error("Invalid index");
        dNode temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val) throws Error{    //no chang
        if(size==0) throw new Error("list is empty");
        if(idx<0 || idx>=size) throw new Error("Invalid index");
        dNode temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        temp.val=val;
    }

}

public class _196b_MethodImplimentationOfDCLL {
    public static void main(String[] args) {
        dcll list=new dcll();
       // list.display();
        list.insertAtTail(200);
        list.insertAtTail(300);
        list.insertAtHead(100);
        list.display();
        list.insertAtIndex(1,10000);
        list.display();
        list.deletAtHead();
        list.display();
        list.deletAtTAil();
        list.display();

        list.insertAtTail(500);
        list.insertAtTail(1200);
        list.display();

        list.deletAtIndex(1);
        list.display();
        System.out.println(list.get(2));
        list.set(2,19000);
        list.display();


    }
}
