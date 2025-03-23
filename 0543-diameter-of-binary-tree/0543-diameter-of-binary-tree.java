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
    public int diameterOfBinaryTree(TreeNode root) {
        if( root == null){
            return 0;
        }
        if(root == null){
            return 0;
        }
        int overallNodeMax = 0;
        Stack<TreeNode> nodeStack = new Stack<>();
        Map<TreeNode,Integer> nodePathCountMap = new HashMap<>();
        nodeStack.push(root);
        while(!nodeStack.isEmpty()){
            TreeNode node = nodeStack.peek();
            if(node.left != null && !nodePathCountMap.containsKey(node.left)){
                nodeStack.push(node.left);
            }else if(node.right!=null && !nodePathCountMap.containsKey(node.right)){
                nodeStack.push(node.right);
            }else {
                TreeNode rootNodeEndofPostOrder = nodeStack.pop();
                int leftMax = nodePathCountMap.getOrDefault(rootNodeEndofPostOrder.left,0);
                int rightMax = nodePathCountMap.getOrDefault(rootNodeEndofPostOrder.right,0);
                int nodeMax = 1 + Math.max(leftMax,rightMax);
                nodePathCountMap.put(rootNodeEndofPostOrder,nodeMax);
                overallNodeMax = Math.max(overallNodeMax,leftMax + rightMax );
            }
            
        }
        return overallNodeMax;
        
    }
}