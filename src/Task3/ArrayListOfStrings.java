package Task3;

public class ArrayListOfStrings {

    private static class Item {
        private String value;

        Item(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    private Item[] items;
    private int index = 0;

    public ArrayListOfStrings() {
        items = new Item[10];
    }

    public ArrayListOfStrings(int size) {
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
        index++;
    }

    public String getElem(int index) {
        return items[index].getValue();
    }

    public int getSize() {
        return items.length;
    }
}
