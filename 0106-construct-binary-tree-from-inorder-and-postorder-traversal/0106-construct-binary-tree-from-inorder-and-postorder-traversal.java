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
    public TreeNode buildTree(int[] in, int[] po) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<in.length;i++){
            mp.put(in[i],i);
        }
        return ped(po,mp,po.length-1,0,in.length-1);
    }
    public static TreeNode ped(int po[],HashMap<Integer,Integer> mp,int i, int l, int r){
        if(i<0 || l>r){
            return null;
        }
        TreeNode root=new TreeNode(po[i]);
        int mid=mp.get(po[i]);
        int xr=r-mid;
        root.right=ped(po,mp,i-1,mid+1,r);
        root.left=ped(po,mp,i-xr-1,l,mid-1);
        return root;
    }
}