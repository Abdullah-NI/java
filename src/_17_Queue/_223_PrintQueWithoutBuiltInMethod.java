package _17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _223_PrintQueWithoutBuiltInMethod {
    //use only a
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);

        Queue<Integer> helper=new LinkedList<>();
        while(que.size()>0){
            System.out.print(que.peek()+",");
            helper.add(que.remove());
        }
        while(helper.size()>0){
            que.add(helper.remove());
        }
    }
}
