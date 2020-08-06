package Task4;

public class DoublyLinkedList {

    private class ListItem {

        private String value;
        private ListItem next;
        private ListItem prev;

        ListItem(String value, ListItem next, ListItem prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public String getValue() {
            return value;
        }

        public ListItem getNext() {
            return next;
        }

        public ListItem getPrev() {
            return prev;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setNext(ListItem next) {
            this.next = next;
        }

        public void setPrev(ListItem prev) {
            this.prev = prev;
        }
    }

    private ListItem first;
    private ListItem last;
    private int size;

    @Deprecated
    public void addLast(String value) {
        if (this.isEmpty()) {
            initList(value);
        } else {
            ListItem item = last.getPrev();
            ListItem insertedItem = new ListItem(value, null, last);
            last = insertedItem;
        }
        size++;
    }

    public void addFirst(String value) {
        if (this.isEmpty()) {
            initList(value);
        } else {
            ListItem oldFirst = first;
            first = new ListItem(value, first, null);
            oldFirst.setPrev(first);
        }
        size++;
    }

    public void showData() {
        ListItem item = first;
        for (int i = 0; i < size; i++) {
            System.out.println(item.getValue());
            item = item.getNext();
        }
    }

    public void initList(String value) {
        first = last = new ListItem(value, null, null);
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}

