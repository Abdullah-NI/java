package _16_Stack;

public class _203_ArrayImplimentationOfStack {
    public static class Stack {
        private int[] arr=new int[5];
        private int idx=0;


        void push(int x) throws Error{
            if(isFull()) throw new Error("array is full");
            arr[idx]=x;
            idx++;
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }

        int peak() throws Error{
            if(idx==0) throw new Error("Stack is empty");
            return arr[idx-1];
        }
        int pop()throws Error{
            if(idx==0) throw new Error("Stack is empty");
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }



    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println(st.size());

        System.out.println(st.peak());

        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());

        System.out.println(st.isEmpty());
        st.push(3000);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.isFull());


    }
}
