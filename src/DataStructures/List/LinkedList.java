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
        if(this.isEmpty()) {
            first = last = new ListItem(value,null);
        } else {
            ListItem item = new ListItem(value, first);
            first = item;
        }
        size++;
    }

    public void addLast(String value) {
        if(this.isEmpty()) {
            first = last = new ListItem(value, null);
        } else {
            last.setNext(new ListItem(value,null));
            last = last.getNext();
        }
        size++;
    }

    public String removeFirst() {
        if (!this.isEmpty()) {
            ListItem removable = first.getNext();
            first = removable;
            size--;
            return removable.getValue();
        } else {
            return "";
        }
    }

    @Deprecated
    public String removeLast() {
        if (!this.isEmpty()) {
            ListItem current;
            for (int i = 0; i < size - 1; i++) {
//                current =
            }
            return "";
        } else {
            return "";
        }
    }

    public void showData() {
        ListItem item = first;
        for (int i = 0; i < size; i++) {
            System.out.println(item.getValue());
            item = item.getNext();
        }
    }

    public String get(int index) {
        try {
            checkOutOfBounds(index);
            ListItem item = first;
            for (int i = 0; i < index; i++) {
                item = item.getNext();
            }
            return item.getValue();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за границы");
            return "";
        }
    }

    private ListItem getItem(int index) {
        checkOutOfBounds(index);
        ListItem current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Deprecated
    private void checkOutOfBounds(int index){
        if (index >= size)
            new IndexOutOfBoundsException();
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return (first == null && last == null);
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
