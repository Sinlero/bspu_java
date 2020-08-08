package Task4;

import Task4.LinkedList.LinkedListOfStrings;

public class Task4Main {
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings();
        list.addFirst("Hello");
        list.addLast("world");
        list.addLast("Java");
        list.addFirst("Hey you!");
        list.removeFirst();
        list.removeLast();
        list.showData();
    }
}
