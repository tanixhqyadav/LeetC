/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        List<ListNode> list1 = new ArrayList<>();
        List<ListNode> list2 = new ArrayList<>();

        ListNode x = headA;
        ListNode y = headB;

        while (x != null) {
            list1.add(x);
            x = x.next;
        }

        while (y != null) {
            list2.add(y);
            y = y.next;
        }

        int h = list1.size() - 1;
        int h2 = list2.size() - 1;

        if (list1.get(h) != list2.get(h2)) {
            return null;
        }

        while (h >= 0 && h2 >= 0 && list1.get(h) == list2.get(h2)) {
            h--;
            h2--;
        }

        return list1.get(h+1);
    }   
}