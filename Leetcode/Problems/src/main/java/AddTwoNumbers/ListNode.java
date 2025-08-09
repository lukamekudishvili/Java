package AddTwoNumbers;

public class ListNode {
    int val;
    ListNode next=new ListNode();

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "["+val+", "+next.toString()+"]";
    }
}