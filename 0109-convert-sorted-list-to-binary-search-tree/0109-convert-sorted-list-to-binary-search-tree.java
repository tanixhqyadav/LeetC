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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        return hola(l,0,l.size()-1);
    }
    public static TreeNode hola(List<Integer> l, int i, int j){
        if(i>j){
            return null;
        }
        int mid=i+(j-i)/2;
        TreeNode node=new TreeNode(l.get(mid));
        node.left=hola(l,i,mid-1);
        node.right=hola(l,mid+1,j);
        return node;
    }
}