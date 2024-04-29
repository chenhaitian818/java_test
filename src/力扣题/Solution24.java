package 力扣题;

public class Solution24 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapPairs(ListNode head) {
          if (head==null||head.next==null) return head;
          ListNode help_Node=head.next;
          head.next=swapPairs(help_Node.next);
          help_Node.next = head;
          return help_Node;
    }
}
