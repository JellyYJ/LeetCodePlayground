package Tree;

import Tree.TreeNode;

public class Traverse {
    public static void main(String[] args) {
//               10
//               / \
//              5   -3
//             / \
//            3   2
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        // Call the methods to print counts and levels
        System.out.println("Postorder Traversal (Counts):");
        int totalCount = count(root);
        System.out.println("Total: " + totalCount + " nodes");
        System.out.println("******************************");
        System.out.println("Preorder Traversal (Levels):");
        traverse(root, 1);
    }


    /* Postorder Question
     * Print the number of left and right child for each node
     * */
    private static int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        System.out.println(String.format("Node %s: left subtree has %d nodes, right subtree has %d nodes", root.val, leftCount, rightCount));
        return leftCount + rightCount + 1;
    }

    /* Preorder Question
     * Print the level of each node, given the root is at level 1
     * */
    private static void traverse(TreeNode root, int level) {
        if (root == null) return;
        System.out.println("Node " + root.val + " at level " + level);
        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }

    /* BFS
    * The key for BFS questions is to find the start and the end of a route
    * */
}



