package Task3;

import java.util.Iterator;

public class IterableArrayListOfStrings implements Iterable {

    @Override
    public Iterator iterator() {
        return new ArrayIterator(items[0]) ;
    }

    private class ArrayIterator implements Iterator {
        private Item current;

        ArrayIterator(Item item) {
            this.current = item;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            String value = current.getValue();
            int index = current.getIndex();
            index++;
            current = items[index];
            return value;
        }
    }

    private static class Item {
        private String value;
        private int index;

        Item(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }

    private Item[] items;
    private int index = 0;

    public IterableArrayListOfStrings() {
        items = new Item[10];
    }

    public IterableArrayListOfStrings(int size) {
        items = new Item[size];
    }

    public void addElem(String value) {
        if (index >= items.length) {
            int size = items.length * 2;
            Item[] temp = new Item[size];
            for (int i = 0; i < index; i++) {
                temp[i] = new Item(this.getElem(i));
            }
            items = temp;
        }
        items[index] = new Item(value);
        items[index].setIndex(index);
        index++;
    }

    public String getElem(int index) {
        return items[index].getValue();
    }

    public int getSize() {
        return items.length;
    }

    public void show() {
        for (int i = 0; i < index; i++) {
            System.out.println(items[i].getIndex());
        }
    }
}
