package DataStructures;

import DataStructures.List.LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast("Motherfucker");
        list.addLast("it will be delete");
        list.removeLast();
        list.showData();
        System.out.println("*****************");
    }
}
