package _15_linkedList;
//class dNode {  //ye piche bani hui hai
//    int val;
//    dNode next;
//    dNode prev;
//    dNode(int val){
//        this.val=val;
//    }
//}
 class Dll {        //userdefine data structure
     dNode head;
     dNode tail;
     int size;

     void display(){
         dNode temp=head;
         while(temp!=null){
             System.out.print(temp.val+" ");
             temp=temp.next;
         }
         System.out.println();
     }
     void insertAtTail(int val){
         dNode temp=new dNode(val);
         if(size==0) head=tail=temp;
         else{
             tail.next=temp;
             temp.prev=tail;
             tail=tail.next;
         }
         size++;
     }
    void insertAtHead(int val){
        dNode temp=new dNode(val);
        if(size==0) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insertAtIndex(int idx,int val) throws Error{
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
    void deletAtHead() throws Error{
        if(size==0) throw new Error("List is empty");
         head=head.next;
         head.prev=null;
         size--;
    }
    void deletAtTAil(){
         tail=tail.prev;
         tail.next=null;
         size--;
    }
    void deletAtIndex(int idx) throws Error{
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

    int get(int idx) throws Error{
         if(size==0) throw new Error("list is empty");
       //  if(idx==size-1) return tail.val;
         if(idx<0 || idx>=size) throw new Error("Invalid index");
         dNode temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val) throws Error{
        if(size==0) throw new Error("list is empty");
        if(idx<0 || idx>=size) throw new Error("Invalid index");
        dNode temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        temp.val=val;
    }
}

public class _194b_MethodImplimentationOfDLL {
    public static void main(String[] args) {
        Dll list=new Dll();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtHead(50);
        list.display();
        list.insertAtIndex(4,1000);
        list.display();
        list.deletAtHead();
        list.display();
        list.deletAtTAil();
        list.display();
        list.deletAtIndex(1);
        list.display();

        list.insertAtTail(50);
        list.insertAtTail(70);
        list.insertAtTail(90);
        list.display();
        System.out.println(list.get(2));
        list.set(0,200);
        list.display();
        list.set(4,200);
        list.display();
        list.set(2,200);
        list.display();


    }
}
