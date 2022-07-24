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
         int height = deepestLeavesHeightRecursive(root);
         int sum = deepestLeavesHeightRecursiveSum(root,1,height);
         return sum;
    }
    
    public int deepestLeavesHeightRecursive(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(deepestLeavesHeightRecursive(root.left), deepestLeavesHeightRecursive(root.right));
    }
    
     public int deepestLeavesHeightRecursiveSum(TreeNode root, int curHeight, int theBiggestHeight) {
        if(root != null && curHeight == theBiggestHeight)
            return root.val;
        if(root == null)
            return 0;
        
        ++curHeight;
        return deepestLeavesHeightRecursiveSum(root.left, curHeight, theBiggestHeight) + deepestLeavesHeightRecursiveSum(root.right, curHeight, theBiggestHeight);
    }
}

//1) Find the biggest high of the tree
//2) Sum vals of the nodes which have high equals to the biggest high of the tree
