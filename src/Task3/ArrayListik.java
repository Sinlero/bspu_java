package Task3;

public class ArrayListik<T> {

    private static class Item<T> {
        private T value;
        private int index;

        Item(T value) {
            this.value = value;
        }

        public T getValue() {
            return this.value;
        }
    }

    private Item[] items;
    private int index = 0;

    public ArrayListik() {
        items = new Item[10];
    }

    public ArrayListik(int size) {
        items = new Item[size];
    }

    public void addElem(T value) {
        if (index >= items.length) {
            int newSize = items.length * 2;
            Item[] temp = new Item[newSize];
            for (int i = 0; i < index; i++) {
                temp[i] = this.getElem(i);
            }
            items = temp;
        }
        items[index] = new Item(value);
        index++;
    }

    public Item getElem(int index) {
        return items[index];
    }

    public int getSize() {
        return items.length;
    }

    public void show() {
        for (int i = 0; i < index; i++) {
            System.out.println(items[i].getValue());
        }
    }
}
