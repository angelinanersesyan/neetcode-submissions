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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            retur true;
        }

        if(height(root) == 1){
            return true;
        }

        else{
            Math.abs(leftSub - rightSub) > 1;
            return false;
        }

        return true;


    public int height(TreeNode p){
        if(p == null){
            return 0;
        }
        int leftSub = height(p.left);
        int righSub = height(p.right);

        return 1 + height(leftSub);
        return 1 + height(rightSub);
    }


    }
}
