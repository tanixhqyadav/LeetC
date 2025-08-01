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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        jumps(root,l);
        int secmin=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<l.size();i++){
            if(l.get(i)<min){
                secmin=min;
                min=l.get(i);
            }
            else if(l.get(i)>min && l.get(i)<secmin){
                secmin=l.get(i);
            }
            mp.put(l.get(i),mp.getOrDefault(l.get(i),0)+1);
        }
        return mp.size()==1 ? -1 : secmin;
    }
    public static void jumps(TreeNode root, ArrayList<Integer> l){
        if(root==null){
            return ;
        }
        jumps(root.left,l);
        l.add(root.val);
        jumps(root.right,l);
    }
}