package DataStructures;

import Task4.DoublyLinkedList;
import Task4.LinkedListOfStrings;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Hello");
        list.addLast("My");
        list.addLast("Dear");
        list.addLast("world");
        list.showData();
    }
}
