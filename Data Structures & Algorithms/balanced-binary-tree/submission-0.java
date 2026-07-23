class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int balance = bf(root);
        return Math.abs(balance) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int bf(TreeNode root) {
        return height(root.left) - height(root.right);
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
}
