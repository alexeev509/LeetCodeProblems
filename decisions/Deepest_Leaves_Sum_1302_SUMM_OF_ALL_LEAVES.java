//https://leetcode.com/problems/deepest-leaves-sum/

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
//SUMM OF ALL LEAVES
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null){
            return root.val;
        }
        return deepestLeavesSum(root.right) + deepestLeavesSum(root.left);
    }
}
