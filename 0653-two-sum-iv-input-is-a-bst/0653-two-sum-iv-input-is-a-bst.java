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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        ArrayList<Integer> l=new ArrayList<>();
        tr(root,l);
        int i=0;
        int j=l.size()-1;
        while(i<j){
            if(l.get(i)+l.get(j)==k){
                return true;
            }
            else if(l.get(i)+l.get(j)>k){
                j--;
            }else if(l.get(i)+l.get(j)<k){
                i++;
            }
        }
        return false;
    }
    public static void tr(TreeNode root, ArrayList<Integer> l){
        if(root==null){
            return ;
        }
        tr(root.left,l);
            l.add(root.val);
        tr(root.right,l);
    }
}