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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        TreeNode cur=root;
        while(cur!=null){
            //split lies in left
            if(p.val < cur.val && q.val < cur.val ){
                cur=cur.left;
            } else if (p.val > cur.val && q.val > cur.val){ // split is in right
                cur=cur.right;
            } else {
                return cur; //this is the split if itnever goes for othertwo condition s above
            }
        }
        return null;
    }
}
