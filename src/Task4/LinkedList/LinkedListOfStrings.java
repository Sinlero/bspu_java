package Task4.LinkedList;

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
            String removableValue = first.getValue();
            first = first.getNext();
            if (size <= 1) {
                last = null;
            }
            size--;
            return removableValue;
        } else {
            return "";
        }
    }

    public String removeLast() {
        if (!this.isEmpty()) {
            String removableValue = last.getValue();
            ListItem current;
            if (size <= 1) {
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
        checkOutOfBounds(index);
        ListItem item = first;
        for (int i = 0; i < index; i++) {
            item = item.getNext();
        }
        return item.getValue();
    }

    private ListItem getItem(int index) {
        checkOutOfBounds(index);
        ListItem current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    private void checkOutOfBounds(int index) {
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

    @Deprecated
    public void showData() {
        ListItem item = first;
        for (int i = 0; i < size; i++) {
            System.out.println(item.getValue());
            item = item.getNext();
        }
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
