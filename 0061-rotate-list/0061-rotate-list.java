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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        List<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        rotate(l,k);
        ListNode op=new ListNode(l.get(0));
        ListNode lp=op;
        for(int i=1;i<l.size();i++){
            ListNode lo=new ListNode(l.get(i));
            lp.next=lo;
            lp=lp.next;
        }

        return op;
    }
    public static void rotate(List<Integer> l, int k){
        // if(k==l.size()){
        //     rev(l,0,l.size()-1);
        // }
        int rot=k%l.size();
        rev(l,0,l.size()-rot-1);
        rev(l,l.size()-rot,l.size()-1);
        rev(l,0,l.size()-1);
    }
    public static void rev(List<Integer> l,int i, int j){
        while(i<j){
            int t=l.get(i);
            l.set(i,l.get(j));
            l.set(j,t);
            i++;
            j--;
        }
    }
}