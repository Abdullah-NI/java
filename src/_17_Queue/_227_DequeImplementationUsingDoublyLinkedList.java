package _17_Queue;

public class _227_DequeImplementationUsingDoublyLinkedList {
    public static class dNode{
        int val;
        dNode next;
        dNode prev;
        public dNode (int val){
            this.val=val;
            this.next=this.prev=null;
        }

    }
    public static class Deque{
        dNode front;  //like head
        dNode rear;     //like tail
        int size;
        Deque(){
            this.front=this.rear=null;
            this.size=0;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        int size(){
            return size;
        }
        void insertfront(int val){
            dNode temp=new dNode(val);
            if(size==0){
                front=rear=temp;
            }
           else{
                temp.next=front;
                front.prev=temp;
                front=temp;
           }
           size++;
        }
        void insertRear(int val){
            dNode temp=new dNode(val);
            if(size==0){
                front=rear=temp;
            }
            else{
                rear.next=temp;
                temp.prev=rear;
                rear=temp;
            }
            size++;
        }
        int deletfront(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            dNode temp=front;
            front=front.next;

            if(front==null) rear=null;
            else front.prev=null;

            size--;

            return temp.val;
        }
        int deletrear(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            dNode temp=rear;
            rear=rear.prev;

            if(rear==null) front=null;
            else rear.next=null;

            size--;

            return temp.val;
        }
        int getfront(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            return front.val;
        }
        int getrear(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            return rear.val;
        }
        void display(){
            if(size==0){
                System.out.println("que is empty");
                return ;
            }
            dNode temp=front;
            while(temp!=null){
                System.out.print(temp.val+",");
                temp=temp.next;
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {

        Deque q=new Deque();
        System.out.println(q.isEmpty());
        q.insertfront(10);
        q.insertfront(20);
        q.insertRear(40);
        q.insertRear(50);
        q.display();
        System.out.println(q.isEmpty());
        q.deletrear();
        q.display();
        q.deletfront();
        q.display();
        System.out.println(q.size());
    }
}
