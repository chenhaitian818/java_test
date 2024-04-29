package 力扣题;

public class Solution19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n ; i++) {
            first = first.next;
        }
        while (first!=null){
            first=first.next;
            second= second.next;
        }
        second.next=second.next.next;
        ListNode result = dummy.next;
        return  result;
    }
}
