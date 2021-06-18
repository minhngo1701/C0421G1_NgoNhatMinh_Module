package _10_dsa_danh_sach.bai_tap;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("Minh");
        myLinkedList.addLast("Hoàng");
        myLinkedList.add(1, "Phong");
        myLinkedList.add(1, "Nam");
        myLinkedList.add(1, "Quân");
        myLinkedList.add(1, "Danh");
        myLinkedList.add(1, "Lâm");
        myLinkedList.printList();
//        System.out.println();
//        System.out.println("Sau khi clear: ");
//        myLinkedList.clear();
//        myLinkedList.printList();
//        System.out.println(myLinkedList.get(2));
//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
//        myLinkedList.remove(1);
//        System.out.println(myLinkedList.indexOf("Minh"));
//        myLinkedList.clone().printList();
//        System.out.println(myLinkedList.contain("Bình"));
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        myLinkedList.printList();
    }


}
