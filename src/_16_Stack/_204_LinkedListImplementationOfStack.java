package _16_Stack;

import java.util.Stack;

class Node {
    int val;
    Node next;

    Node (int val){
        this.val=val;
    }
}

public class _204_LinkedListImplementationOfStack {
    public static class stack {
        Node head;
        int size;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop() throws Error{
            if(head==null) throw new Error("Stack is Empty");
            Node temp=head;
            head=head.next;
            size--;
            return temp.val;
        }
        int peak() throws Error{
            if(head==null) throw new Error("Stack is Empty");
            return head.val;
        }
        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        void display(){
           displayRec(head);
            System.out.println();
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.peak());
        System.out.println(st.size());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.isEmpty());

    }
}
