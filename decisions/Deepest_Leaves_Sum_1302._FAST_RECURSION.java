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

//https://leetcode.com/problems/deepest-leaves-sum/
class Solution {
    public int deepestLeavesSum(TreeNode root) {
         int[] heightAndSum = new int[2];
         deepestLeavesSumRecursive(root, 0, heightAndSum);
         return heightAndSum[1];
    }
    
    public void deepestLeavesSumRecursive(TreeNode root, int level, int[] heightAndSum) {
        if(root == null)
            return;
        deepestLeavesSumRecursive(root.left, level+1, heightAndSum);
        deepestLeavesSumRecursive(root.right, level+1, heightAndSum);
        
        if(heightAndSum[0] < level){
            heightAndSum[0] = level;
            heightAndSum[1] = root.val;
        }
        else if (heightAndSum[0] == level){
            heightAndSum[1] += root.val;
        }
    }
}
