package _15_linkedList;
class mNode{
    int val;
    mNode next;
    mNode prev;
    mNode child;
    mNode(int val){
        this.val=val;
    }

}

public class _197_L_430FlattenAMultiLevelDoublyLinkedList {
    public static mNode flatten(mNode head) {
        mNode temp=head;
        while(temp!=null){
            mNode n=temp.next;
            if(temp.child!=null){
                mNode c=temp.child;//flatten(temp.child);   // bina iske bhi chal raha ie. is bina calling only c
                mNode d=c;                                  //me  temp.child dala;  ab run time 0 milli second hai
                while(d.next!=null){
                    d=d.next;
                }
                temp.next=c; c.prev=temp;
                d.next=n;
                if(n!=null) n.prev=d;
                // set child is null
                temp.child=null;
            }
            else{
                temp=n;
            }
        }
        return head;
    }
    public static void print(mNode head){
        mNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        mNode A=new mNode(1);
        mNode B=new mNode(2);
        mNode C=new mNode(3);
        mNode D=new mNode(4);
        mNode E=new mNode(5);
        mNode F=new mNode(6);
        mNode A1=new mNode(7);
        mNode B1=new mNode(8);
        mNode C1=new mNode(9);
        mNode D1=new mNode(10);
        mNode A2=new mNode(11);
        mNode B2=new mNode(12);

//        mNode A3=new mNode(13);
//        mNode B3=new mNode(14);
//        mNode C3=new mNode(15);

        A.next=B; B.prev=A;
        B.next=C; C.prev=B;
        C.next=D; D.prev=C;
        D.next=E; E.prev=D;
        E.next=F; F.prev=E;

//        A.child=A3;
//        A3.next=B3;B3.prev=A3;
//        B3.next=C3;C3.prev=B3;

        C.child=A1;
        A1.next=B1; B1.prev=A1;
        B1.next=C1; C1.prev=B1;
        C1.next=D1; D1.prev=C1;

        B1.child=A2;
        A2.next=B2; B2.prev=A2;

        print(A);
        System.out.print("    ");
        print(A1);
        System.out.print("      ");
        print(A2);

        mNode ans=flatten(A);
        print(A);





    }
}
