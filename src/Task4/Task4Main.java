package Task4;

import Task4.DoublyLinkedList.DoublyLinkedList;
import Task4.LinkedList.LinkedListOfStrings;


public class Task4Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList("Hello", "world", "java");
        System.out.println(list.get(0));
    }
}
