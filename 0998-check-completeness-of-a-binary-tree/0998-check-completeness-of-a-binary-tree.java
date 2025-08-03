// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
//  class Pair{
//     TreeNode p;
//     int ins;
//     Pair(TreeNode p, int ins){
//         this.p=p;
//         this.ins=ins;
//     }
//  }
// class Solution {
//     public boolean isCompleteTree(TreeNode root) {
//         Queue<Pair> q=new LinkedList();
//         q.add(new Pair(root,0));
//         int c=0;
//         int idx=0;
//         while(!q.isEmpty()){
//             Pair l=q.poll();
//             TreeNode op=l.p;
//             int kl=l.ins;
//             idx=kl;
//             c++;          
//             if(op.left!=null){
//                 q.add(new Pair(op.left,2*kl+1));
//                 // l.add(op.left.val);
//             }
//             if(op.right!=null){
//                 q.add(new Pair(op.left,2*kl+2));
//                 // l.add(op.right.val);
//             }
//         }
//         System.out.println(idx+" "+c);
//         return c==idx;
//     }
// }
class Pair {
    TreeNode p;
    int ins;
    Pair(TreeNode p, int ins) {
        this.p = p;
        this.ins = ins;
    }
}

class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int c = 0;
        int idx = 0;

        while (!q.isEmpty()) {
            Pair l = q.poll();
            TreeNode op = l.p;
            int kl = l.ins;
            idx = kl;
            c++;

            if (op.left != null) {
                q.add(new Pair(op.left, 2 * kl + 1));
            }
            if (op.right != null) {
                q.add(new Pair(op.right, 2 * kl + 2)); 
            }
        }

        System.out.println(idx +"" + c);
        return c == idx + 1;
    }
}
