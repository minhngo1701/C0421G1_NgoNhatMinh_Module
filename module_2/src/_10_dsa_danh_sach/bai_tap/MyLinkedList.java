package _10_dsa_danh_sach.bai_tap;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes = 0;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
        if (tail == null) {
            tail = head;
        }
    }
    public void addLast(E data){
        if (tail == null) {
            head = tail = new Node(data);
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
    }
    public void add(int index, E data) {
        Node temp = head;
        Node holder;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
