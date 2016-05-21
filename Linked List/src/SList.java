/**
 * Created by Ambition on 5/21/16.
 */
public class SList {
    private SListNode head;
    private int size;

    public SList() {
        this.head = null;
        this.size = 0;
    }

    public void insertFront(Object item) {
        this.head = new SListNode(item, head);
        size ++;
    }
}
