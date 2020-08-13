package DataStructures;

import Task4.LinkedList.*;

public class Main {
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings("Hello");
        list.removeLast();
        list.showData();
    }
}
