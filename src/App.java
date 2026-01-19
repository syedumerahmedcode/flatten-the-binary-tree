public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given the root of a binary tree, flatten the tree into a "linked list":
         * 
         * The "linked list" should use the same TreeNode class where the right child
         * pointer points to the next node in the list and the left child pointer is
         * always null.
         * The "linked list" should be in the same order as a pre-order traversal of the
         * binary tree.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: root = [1,2,5,3,4,null,6]
         * Output: [1,null,2,null,3,null,4,null,5,null,6]
         * 
         * Example 2:
         * 
         * Input: root = []
         * Output: []
         * 
         * Example 3:
         * 
         * Input: root = [0]
         * Output: [0]
         * 
         */
        // Constructing a binary tree with 7 nodes
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        solution.flatten(root);

    }
}
