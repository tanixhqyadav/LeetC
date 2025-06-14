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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> ll=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sz=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<sz;i++){
                TreeNode tq=q.poll();
                l.add(tq.val);
                if(tq.left!=null){
                    q.add(tq.left);
                }
                if(tq.right!=null){
                    q.add(tq.right);
                }
            }
            ll.add(l);
        }
        return kl(ll);
    }
    public static List<Double> kl(List<List<Integer>> ll){
        List<Double> opa=new ArrayList<>();
        for(int i=0;i<ll.size();i++){
            double op=0;
            double x=(double) ll.get(i).size();
            for(int j=0;j<ll.get(i).size();j++){
                op+=ll.get(i).get(j);
            }
            opa.add(op/x);
        }
        return opa;
    }
}