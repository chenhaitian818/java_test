package 力扣题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution234 {
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

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        ListNode listNode = head;

        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        int different = list.size()-1;
        while (head != null) {
            if (list.get(different) != head.val) return false;
            head = head.next;
            --different;
        }
        return true;
    }
}
