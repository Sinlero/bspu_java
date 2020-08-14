package Lists.LinkedList;

import java.util.Iterator;

public class LinkedListOfStrings implements Iterable {

    protected ListItem first = null;
    protected ListItem last = null;
    protected int size = 0;

    public LinkedListOfStrings(String... strings)  {
        for (String string : strings) {
            addLast(string);
        }
    }

    public void addFirst(String value) {
        if (this.isEmpty()) {
            initList(value);
        } else {
            first = new ListItem(value, first);
        }
        size++;
    }

    public void addLast(String value) {
        if (this.isEmpty()) {
            initList(value);
        } else {
            last.setNext(new ListItem(value, null));
            last = last.getNext();
        }
        size++;
    }

    protected void initList(String value) {
        first = last = new ListItem(value, null);
    }

    public String removeFirst() {
        if (!this.isEmpty()) {
            ListItem removableValue = first;
            first = first.getNext();
            if (size == 1) {
                last = null;
            }
            size--;
            return removableValue.getValue();
        } else {
            return "";
        }
    }

    public String removeLast() {
        if (!this.isEmpty()) {
            String removableValue = last.getValue();
            ListItem current;
            if (size == 1) {
                first = null;
                last = null;
            } else {
                current = getItem(size - 2);
                current.setNext(null);
                last = current;
            }
            size--;
            return removableValue;
        }
        return "";
    }


    public String get(int index) {
        return getItem(index).getValue();
    }

    private ListItem getItem(int index) {
        checkOutOfBounds(index);
        ListItem current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    protected void checkOutOfBounds(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(first);
    }

    private class ListIterator implements Iterator {

        private ListItem current;

        public ListIterator(ListItem item) {
            this.current = item;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String value = current.getValue();
            current = current.getNext();
            return value;
        }
    }
}
