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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        String s="";
        while(temp!=null){
            s+=temp.val;
            temp=temp.next;
        }
        return op(s);
    }
    public static int op(String s){
        int x=0;
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                x+=(int) Math.pow(2,c);
            }else{
                x+=0;
            }
            c++;
        }
        return x;
    }
}