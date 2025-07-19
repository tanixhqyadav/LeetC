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
    private String smallest = "~";

    public String smallestFromLeaf(TreeNode root) {
        findSmallest(root, new StringBuilder());
        return smallest;
    }

    private void findSmallest(TreeNode node, StringBuilder path) {
        if (node == null) {
            return;
        }

        path.insert(0, (char) (node.val + 'a'));

        if (node.left == null && node.right == null) {
            String currentPath = path.toString();
            if (currentPath.compareTo(smallest) < 0) {
                smallest = currentPath;
            }
        } else {
            findSmallest(node.left, path);
            findSmallest(node.right, path);
        }
        path.deleteCharAt(0);
    }
}