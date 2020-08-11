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
        if (!this.isEmpty()) {
            DoublyListItem removable = (DoublyListItem) first;
            first = first.getNext();
            ((DoublyListItem) first).setPrev(null);
            removable.setNext(null);
            size--;
            return removable.getValue();
        } else {
            return "";
        }
    }
    
    @Override
    public String removeLast() {
        if (!this.isEmpty()) {
            DoublyListItem removable = (DoublyListItem) last;
            last = ((DoublyListItem) last).getPrev();
            last.setNext(null);
            removable.setPrev(null);
            size--;
            return removable.getValue();
        } else {
            return "";
        }
    }

    @Deprecated
    private String removeItem() {
        return "";
    }

    public void initList(String value) {
        first = last = new DoublyListItem(value, null, null);
    }

}

