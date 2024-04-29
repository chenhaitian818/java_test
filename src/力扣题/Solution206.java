package 力扣题;

public class Solution206 {
    public static class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode My_Node=null;
        ListNode Help_Node=head;
        while (Help_Node!=null){
            ListNode next = Help_Node.next;
            Help_Node.next=My_Node;
            My_Node=Help_Node;
            Help_Node=next;
        }
        return My_Node;
    }
}
