package StackAndQueue;

import java.io.FilterOutputStream;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Peak Element :" + queue.peek());
        System.out.println(queue);

        queue.offer(50);
        queue.offer(60);

        System.out.println("Poped element :" + queue.poll());

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();


        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.element());
    }
}
