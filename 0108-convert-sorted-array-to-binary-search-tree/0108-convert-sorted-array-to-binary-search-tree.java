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
    public TreeNode sortedArrayToBST(int[] nums) {
        return recCall(nums,0,nums.length-1);
    }
    public static TreeNode recCall(int ar[], int i, int j){
        if(i>j){
            return null;
        }
        int mid=i+(j-i)/2;
        TreeNode node=new TreeNode(ar[mid]);
        node.left=recCall(ar,i,mid-1);
        node.right=recCall(ar,mid+1,j);
        return node;
    }
}