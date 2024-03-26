package generics;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainTask2 {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(5);
        myStack.push(45);
        myStack.push(3);
        myStack.push(7);
        myStack.push(78);
        myStack.push(65);
        myStack.push(34);
        System.out.println("Push: " + myStack);
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop my stack: " + myStack);
        System.out.println("Is empty: " + myStack.isEmpty());

    }
}
