package _17_Queue;

public class _225_ArrayImplimentation {
    public static class Que {
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[5];

        public void add(int val){
            if(r==arr.length){//overflow condition
                System.out.println("que is full");
                return ;
            }
            if(f==-1 && r==-1){
                f=r=0;
                arr[r]=val;
            }
            else {
                //r++;
               // arr[r]=val;
                //ya
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            int val=arr[f];
            f++;
            size--;
            return val;
        }
        public int peek(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            return arr[f];
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
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+",");
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
        q.display();
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

    }
}
