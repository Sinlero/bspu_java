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
            last = new DoublyListItem(value, null, (DoublyListItem) last);
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
    public String removeFirst() {
        if (!this.isEmpty()) {
            DoublyListItem removable = (DoublyListItem) first;
            first = first.getNext();
            if (size == 1) {
                last = null;
            } else {
                ((DoublyListItem) first).setPrev(null);
                removable.setNext(null);
            }
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
            if (size == 1) {
                first = null;
            } else {
                last.setNext(null);
                removable.setPrev(null);
            }
            size--;
            return removable.getValue();
        } else {
            return "";
        }
    }

    @Override
    public String get(int index) {
        checkOutOfBounds(index);
        int half = size / 2;
        DoublyListItem item;
        if (index < half) {
            item = (DoublyListItem) first;
            for (int i = 0; i < index; i++) {
                item = (DoublyListItem) item.getNext();
            }
        } else {
            item = (DoublyListItem) last;
            for (int i = size - 1; i > index; i--) {
                item = item.getPrev();
            }
        }
        return item.getValue();
    }

    private void initList(String value) {
        first = last = new DoublyListItem(value, null, null);
    }

}

