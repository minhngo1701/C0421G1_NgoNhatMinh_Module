package _11_dsa_stack_queue.bai_tap;


import java.util.Queue;

public class MyQueue {


    public static class Node
    {
        private int data;
        private Node  link;
    }

    static class Queue
    {
        private Node  front;
        private Node  rear;
    }


    public static void enQueue(Queue  q, int value)
    {
        Node  temp = new Node();
        temp .data = value;
        if (q .front ==  null)
            q .front = temp;
        else
            q .rear .link = temp;

        q .rear = temp;
        q .rear .link = q .front;
    }


    public static int deQueue(Queue  q)
    {
        if (q .front ==  null)
        {
            System.out.printf ("Queue is empty");
            return Integer.MIN_VALUE;
        }


        int value;
        if (q .front == q .rear)
        {
            value = q .front .data;
            q .front =  null;
            q .rear =  null;
        } else {
            Node  temp = q .front;
            value = temp .data;
            q .front = q .front .link;
            q .rear .link= q .front;
        }

        return value ;
    }

    static void displayQueue( Queue  q)
    {
        Node  temp = q .front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.link != q .front)
        {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String args[])
    {
        Queue queue = new Queue();
        queue.front = queue.rear = null;


        enQueue(queue, 1);
        enQueue(queue, 2);
        enQueue(queue, 3);
        displayQueue(queue);

        deQueue(queue);
        displayQueue(queue);

        enQueue(queue, 4);
        enQueue(queue, 5);
        displayQueue(queue);

    }


}

