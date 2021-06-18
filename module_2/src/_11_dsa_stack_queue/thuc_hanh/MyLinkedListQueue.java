package _11_dsa_stack_queue.thuc_hanh;

import _10_dsa_danh_sach.bai_tap.MyLinkedList;

import javax.xml.soap.Node;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        public Node next;
        public int key;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }

}
