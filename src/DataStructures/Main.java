package DataStructures;

import DataStructures.List.LinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast("Motherfucker");
        list.addLast("it will be delete");
        list.addLast("qwertyuiop");
        list.addLast("asdfghjkl");
        list.addLast("zxcvbnm");
        list.removeLast();
        list.showData();
        System.out.println("*****************");
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("*****************");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
