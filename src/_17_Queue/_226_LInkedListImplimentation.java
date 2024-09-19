package _17_Queue;

public class _226_LInkedListImplimentation {
   public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
   public static class Que{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            int val=head.val;
            head=head.next;
            size--;
            return val;
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public int size(){
            return size;
        }
        public void display(){
            if(size==0){
                System.out.println("que is empty");
                return ;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+",");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Que q=new Que();

        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }

}