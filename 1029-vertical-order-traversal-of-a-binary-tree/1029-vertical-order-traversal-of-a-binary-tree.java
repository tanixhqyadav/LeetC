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
// class Solution {
//     public List<List<Integer>> verticalTraversal(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         if (root == null) return result;
//         TreeMap<Integer, List<Integer>> map = new TreeMap<>();
//         Queue<Pair> queue = new LinkedList<>();

//         queue.add(new Pair(root, 0));
//         while (!queue.isEmpty()) {
//             Pair p = queue.poll();
//             TreeNode node = p.node;
//             int hd = p.hd;
            

//             if (node.left != null) {
//                 queue.add(new Pair(node.left, hd - 1));
//             }
//             if (node.right != null) {
//                 queue.add(new Pair(node.right, hd + 1));
//             }
//             if (!map.containsKey(hd)) {
//                 List<Integer> l = new ArrayList<>();
//                 l.add(node.val);
//                 map.put(hd,l);
//             }
//             else {
//                 List<Integer> l = map.get(hd);
//                 l.add(node.val);
//                 map.put(hd,l);
//             }
//             System.out.println(node.val);
//         }
//         System.out.println(map);
//         for (int i : map.keySet()) {
//             List<Integer> l = map.get(i);
//             // Collections.sort(l);
//             result.add(l);
//         }

//         return result;
//     }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Map: hd -> (level -> sorted values)
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Triplet> queue = new LinkedList<>();
        queue.add(new Triplet(root, 0, 0));

        while (!queue.isEmpty()) {
            Triplet t = queue.poll();
            TreeNode node = t.node;
            int hd = t.hd;
            int lvl = t.lvl;

            map.putIfAbsent(hd, new TreeMap<>());
            map.get(hd).putIfAbsent(lvl, new PriorityQueue<>());
            map.get(hd).get(lvl).add(node.val);

            if (node.left != null)
                queue.add(new Triplet(node.left, hd - 1, lvl + 1));
            if (node.right != null)
                queue.add(new Triplet(node.right, hd + 1, lvl + 1));
        }

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> levelMap : map.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : levelMap.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            result.add(col);
        }
        return result;
    }

    static class Triplet {
        TreeNode node;
        int hd, lvl;

        Triplet(TreeNode node, int hd, int lvl) {
            this.node = node;
            this.hd = hd;
            this.lvl = lvl;
        }
    }
}