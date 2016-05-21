/**
 * Created by Ambition on 5/21/16.
 */
public class ListNode {
    public int item;
    public ListNode next;

    public ListNode(int item, ListNode node) {
        this.item = item;
        this.next = node;
    }

    public ListNode(int item) {
        this(item, null);
    }

    public void insertAfter(int item) {
        this.next = new ListNode(item, this.next);
    }
}
