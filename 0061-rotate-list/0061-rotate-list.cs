// using System;
// using System.Collections.Generic;

// public class ListNode {
//     public int val;
//     public ListNode next;
//     public ListNode(int val = 0, ListNode next = null) {
//         this.val = val;
//         this.next = next;
//     }
// }

public class Solution {
    public ListNode RotateRight(ListNode head, int k) {
        if (head == null) return null;

        List<int> l = new List<int>();
        ListNode temp = head;

        while (temp != null) {
            l.Add(temp.val);
            temp = temp.next;
        }

        op(l, k);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        foreach (int val in l) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void op(List<int> l, int k) {
        k = k % l.Count;
        rev(0, l.Count - 1, l);
        rev(0, k - 1, l);
        rev(k, l.Count - 1, l);
    }

    public static void rev(int i, int j, List<int> l) {
        while (i <= j) {
            int t = l[i];
            l[i] = l[j];
            l[j] = t;
            i++;
            j--;
        }
    }
}
