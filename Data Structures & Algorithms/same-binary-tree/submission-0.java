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
    public boolean isSameTree(TreeNode p, TreeNode q) {

            if(p == null || q == null){
                return true;
            }

            int element1 = traverseP(p);
            int element2 = traverseQ(q);


            if(element1 == elemnt2){
                rteurn true;
            }

                false;
        
    }

    public int traverseP(TreeNode p){
        if(p == null) return;
        traverse(p.getElement());
    }


      public int traverseQ(TreeNode q){
        if(q == null) return;
        traverse(q.getElement);
    }







}
