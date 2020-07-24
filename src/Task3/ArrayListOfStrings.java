package Task3;

public class ArrayListOfStrings {
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
            System.out.println("overflow");
            int size = items.length * 2;
            Item[] temp = new Item[size];
            for (int i = 0; i < index; i++) {
                temp[i].setValue(this.getElem(i));
            }
            items = temp;
        }
        items[index].setValue(value);
        index++;
    }

    public String getElem(int index) {
        return items[index].getValue();
    }

    public int getSize() {
        return index;
    }







    private class Item {
        private String value;
        private int index;

        Item() {
            value = "";
            index++;
        }

        Item(String value) {
            this.value = value;
            index++;
        }

        public void setValue(String value) {
            this.value = value;
            index++;
        }

        public int getIndex() {
            return index;
        }

        public String getValue() {
            return this.value;
        }
    }
}
