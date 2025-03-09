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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root1);
        s2.push(root2);
        while (!s1.empty() && !s2.empty())
            if (dfs(s1) != dfs(s2))
                return false;

        return s1.empty() && s2.empty();
    }

    int dfs(Stack<TreeNode> s) {
        while (true) {
            TreeNode temp = s.pop();
            if (temp.left != null)
                s.push(temp.left);
            if (temp.right != null)
                s.push(temp.right);
            if (temp.left == null && temp.right == null)
                return temp.val;
        }
    }
}