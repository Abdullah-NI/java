package _17_Queue;

public class _228_CircularQueArray {
    public static class cQue{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[5];
        int n=arr.length;

        public void add(int val){
            if(size==n){
                System.out.println("que is full");
                return;
            }
            else if(f==-1 && r==-1){
                f=r=0;
                arr[0]=val;
            }
            else if(r==n-1){
                r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
           else{
               int x=arr[f];
               if(f==n) f=0;
               else f++;
               size--;
               return x;
            }
        }
        public int peek(){
            if(size==0){
                System.out.println("que is empty");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("que is empty");
                return ;
            }
            else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+",");
                }
            }
            else if(r<f){
                for(int i=f;i<=n-1;i++){
                    System.out.print(arr[i]+",");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+",");
                }
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        cQue q=new cQue();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.remove();
        q.display();
        q.add(200);
        q.display();




    }
}
