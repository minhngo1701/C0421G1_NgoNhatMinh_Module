package _11_dsa_stack_queue.thuc_hanh;



public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.enqueue(20);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(30);
        myLinkedListQueue.enqueue(40);
        myLinkedListQueue.enqueue(50);
        System.out.println("Dequeued item is " + myLinkedListQueue.dequeue().key);

    }
}
