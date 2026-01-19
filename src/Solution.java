public class Solution {

    public void flatten(TreeNode root) {
        flattenTree(root);
    }

    private TreeNode flattenTree(TreeNode node) {
        /**
         * If the given node is null, return null
         */
        if (node == null) {
            return null;
        }
        /**
         * if the given node is leaf node then return that node as it is.
         */
        if (node.left == null && node.right == null) {
            return node;
        }
        /**
         * find the left most tail of the tree
         */
        TreeNode leftTail = flattenTree(node.left);
        /**
         * Find the right most tail of the tree
         */
        TreeNode rightTail = flattenTree(node.right);

        /**
         * Core logic part here:
         * If left tail exists, then do the following:
         * 1 - leftchild.right=root.right
         * 2 - root.right =leftchild
         * 3 - root.left=null
         * In our case:
         * leftChild=>leftTail
         * root=>node
         */
        if (leftTail != null) {
            leftTail.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        return (rightTail == null) ? leftTail : rightTail;
    }

}
