package DataStructures.List;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList implements Iterable {

    private class ListItem {
        private String value;
        private ListItem next;

        ListItem(String value, ListItem next) {
            this.value = value;
            this.next = next;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setNext(ListItem next) {
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public ListItem getNext() {
            return next;
        }
    }

    private ListItem first = null;
    private ListItem last = null;
    private int size = 0;

    public void addFirst(String value) {
        if(first == null && last == null) {
            first = last = new ListItem(value,null);
        } else {
            ListItem item = new ListItem(value, first);
            first = item;
        }
        size++;
    }

    public void addLast(String value) {
        if(first == null && last == null) {
            first = last = new ListItem(value, null);
        } else {
            last.setNext(new ListItem(value,null));
            last = last.getNext();
        }
        size++;
    }

    public void showData() {
        ListItem item = first;
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(item.getValue());
            item = item.getNext();
        }
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
