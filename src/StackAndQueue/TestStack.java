package StackAndQueue;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        System.out.println("Peak Element :" + stack.peek());

        stack.add(50);
        stack.add(60);
        System.out.println("Poped element :"+stack.pop());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(40));

    }
}
