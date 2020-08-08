package Task4.DoublyLinkedList;

import Task4.LinkedList.ListItem;

public class DoublyListItem extends ListItem {

    private DoublyListItem prev;

    public DoublyListItem(String value, ListItem next, DoublyListItem prev) {
        super(value, next);
        this.prev = prev;
    }

    public DoublyListItem getPrev() {
        return prev;
    }

    public void setPrev(DoublyListItem prev) {
        this.prev = prev;
    }
}
