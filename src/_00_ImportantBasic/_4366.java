package _00_ImportantBasic;
import java.util.Stack;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}

public class _4366 {
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode Next=head;
        ListNode prev=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public static ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
        // ListNode newHead=head;
        // ListNode move=head;
        while(temp!=null){
            while(st.size()>0 && temp.val>st.peek().val){
                st.pop();
            }
            st.push(temp);
            // if(st.size()==1) {
            //     newHead=st.peek();
            //      move=newHead;
            // }
            // else{
            //     move.next=st.peek();
            //     move=st.peek();
            // }

            temp=temp.next;
        }
//        while(!st.isEmpty()){
//            System.out.print(st.pop().val+" ");
//        }
        ListNode dummy=new ListNode(-1);
        ListNode temp2=dummy;
        while(!st.isEmpty()){
            temp2.next=st.peek();
            temp2=temp2.next;
            st.pop();
        }
        temp2.next=null;
        ListNode newHead=reverse(dummy.next);

        return newHead;
    }
    public static void main(String[] args) {
       ListNode a=new ListNode(5);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(13);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        ListNode ans=removeNodes(a);
        ListNode temp=ans;

        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
