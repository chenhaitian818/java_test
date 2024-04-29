package 力扣题;

public class Solution142 {
      static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
            next = null;
     }
 }

    public static void main(String[] args) {
        System.out.println(detectCycle(new ListNode(2)));
    }
    public static ListNode detectCycle(ListNode head) {
         ListNode fast=head;
         ListNode slow=head;
         while (fast.next.next!=null&&slow.next!=null){
             if (fast.val==slow.val){
                 fast=head;
                 while (fast.val!= slow.val){
                     fast=fast.next;
                     slow=slow.next;
                     if (fast.val==slow.val)return fast;
                 }
             }
             fast=fast.next.next;
             slow=slow.next;
         }
         return null;
    }
}
