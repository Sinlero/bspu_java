package DataStructures;

import Task4.DoublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst("Hello");
        list.addFirst("world");
        list.addFirst("java");
        list.showData();
    }
}
