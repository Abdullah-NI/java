package _17_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _224_removeEvenPositionElewith0basedIndexing {
     static Queue<Integer> que;
    static Queue<Integer> newQue;

    public static void removeEven(){
        newQue=new LinkedList<>();
        while(!que.isEmpty()){
            que.remove();
            if(!que.isEmpty()) newQue.add(que.remove());
        }
//        while (!newQue.isEmpty()){
//            que.add(newQue.remove());
//        }

        //ya
        que=newQue;
    }
    public static void main(String[] args) {
        que=new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        que.add(80);

        System.out.println(que);
        removeEven();
        System.out.println(que);

    }
}
