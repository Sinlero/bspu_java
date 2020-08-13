package Task4;

import Task4.DoublyLinkedList.DoublyLinkedList;

public class Task4Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList("Hello", "world", "java", "version", "1", "8", "211", "test");
        System.out.println(list.get(4));
    }
}
