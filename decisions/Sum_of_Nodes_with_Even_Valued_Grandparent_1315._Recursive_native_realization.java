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

//https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        TreeNode parentRight = root.right, parentLeft = root.left;
        int[] sum = new int[1];
        sumEvenGrandparentRecursive(root, parentRight, sum);
        sumEvenGrandparentRecursive(root, parentLeft, sum);
        return sum[0];
    }
    
    public void sumEvenGrandparentRecursive(TreeNode grandParent,TreeNode parent, int[] sum){
        if(parent == null)
            return;
        int valLeft = parent.left == null ? 0 : parent.left.val;
        int valRight = parent.right == null ? 0 : parent.right.val;
        if(grandParent.val % 2 == 0)
            sum[0] += valLeft + valRight;
        sumEvenGrandparentRecursive(parent,parent.left,sum);
        sumEvenGrandparentRecursive(parent,parent.right,sum);
    }
}
