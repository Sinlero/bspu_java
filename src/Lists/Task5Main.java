package Lists;

import Lists.DoublyLinkedList.DoublyLinkedList;

public class Task5Main {
    public static void main(String[] args) {
        String result = "";
        DoublyLinkedList list = new DoublyLinkedList("Hello", "world", "java", "version", "1", "8", "211");
        for (Object o : list) {
            result += o;
        }
        System.out.println(result);
    }
}
