package Task4.LinkedList;

public class ListItem {
    private String value;
    private ListItem next;

    public ListItem(String value, ListItem next) {
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
