package 力扣题;


public class Solution160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA.val == headB.val) {
            System.out.println(headA==headB);
        }
        while (headA.next!=null){
            headA=headA.next;
            while (headB.next!=null){
                headB=headB.next;
                if (headA.val==headB.val){
                    return headA;
                }
            }
        }
        return headA;
    }
}
