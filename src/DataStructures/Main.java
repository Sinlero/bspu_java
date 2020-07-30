package DataStructures;

import DataStructures.List.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.addFirst("hello");
//        list.addLast("world");
//        list.addFirst("Hey you!");
//        list.addLast("Motherfucker");
        list.showData();
        System.out.println();
        list.removeFirst();
        list.showData();
        System.out.println(list.getSize());

        System.out.println(list.isEmpty());

        System.out.println(list.get(6));

    }
}
