/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> lp=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            lp.add(nums[i]);
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            if(lp.contains(temp.val) && ((temp.next==null) || (!lp.contains(temp.next.val)))){
                c++;
            }
            temp=temp.next;
        }
        return c;

    }
}