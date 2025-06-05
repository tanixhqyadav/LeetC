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
    public TreeNode buildTree(int[] pre, int[] in) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<in.length;i++){
            mp.put(in[i],i);
        }
        return banao_ped(pre,mp,0,0,in.length-1);
    }
    public static TreeNode banao_ped(int pre[],HashMap<Integer,Integer> mp,int i, int l, int r){
        TreeNode root=new TreeNode(pre[i]);
        int mid=mp.get(pre[i]);
        if(mid>l){
            root.left=banao_ped(pre,mp,i+1,l,mid-1);
        }if(mid<r){
            root.right=banao_ped(pre,mp,i+mid-l+1,mid+1,r);
        }
        return root;
    }
    
}