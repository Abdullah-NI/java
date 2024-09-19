package _17_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _221_QueueBasic {
    public static void main(String[] args) {
       // Queue<Integer> que=new ArrayDeque<>();  //initilization
        Queue<Integer> que=new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);

        System.out.println(que);

        que.remove();
        System.out.println(que);
        int a=que.remove();
        System.out.println(a);
        System.out.println(que);
        //ya
        que.poll();
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);

        //remove vs poll
        que.remove();
        que.remove();
        System.out.println(que);
       // que.remove();  //give error
        que.poll();
        System.out.println(que.poll());
        System.out.println(que);

        que.add(10);
        que.add(20);
        que.add(30);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());

    }
}
