package Task4.DoublyLinkedList;

import Task4.LinkedList.LinkedListOfStrings;

public class DoublyLinkedList extends LinkedListOfStrings {

    public DoublyLinkedList(String... strings) {
        for (String string : strings) {
            addLast(string);
        }
    }

    @Override
    public void addLast(String value) {
        if (this.isEmpty()) {
            initList(value);
        } else {
            DoublyListItem oldLast = (DoublyListItem) last;
            last = new DoublyListItem(value,null, (DoublyListItem) last);
            oldLast.setNext(last);
        }
        size++;
    }

    @Override
    public void addFirst(String value) {
        if (this.isEmpty()) {
            initList(value);
        } else {
            DoublyListItem oldFirst = (DoublyListItem) first;
            first = new DoublyListItem(value, first, null);
            oldFirst.setPrev((DoublyListItem) first);
        }
        size++;
    }

    @Override
    public String removeFirst(){
        return "";
    }
    
    @Override
    public String removeLast() {
        return "";
    }

    public void initList(String value) {
        first = last = new DoublyListItem(value, null, null);
    }

}

