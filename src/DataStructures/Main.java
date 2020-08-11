package DataStructures;

import Task4.LinkedList.*;

public class Main {
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings();
        list.addFirst("Hello");
        list.addFirst("world");
        list.addFirst("java");
        list.showData();
    }
}
