package Tree;

import Tree.TreeNode;

public class pathSum {
    public static void main(String[] args) {
//               10
//               / \
//              5   -3
//             / \
//            3   2
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(10);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(5);
        subRoot.left = new TreeNode(3);
        subRoot.right = new TreeNode(2);

        // SubTree Question
//        SubTree solution = new SubTree();
//        boolean result = solution.isSubtree(root, subRoot);
//        System.out.println("SubTree found? " + result);

        // 404. LeftLeavesSum
//        SumOfLeftLeaves sol = new SumOfLeftLeaves();
//        int result = sol.sumOfLeftLeaves(root);
//        System.out.println("Sum " + result);

        // 687. Longest Univalue Path
//        LongestUnivaluePath sol = new LongestUnivaluePath();
//        int result = sol.longestUnivaluePath(root);
//        System.out.println("Longest Univalue Path " + result);


    }

    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        traverse(root, targetSum);
        return count;
    }

    private void traverse(TreeNode node, int target) {
        if (node == null) {
            return;
        }

        System.out.println("Visiting node: " + node.val);
        dfs(node, target);

        // Recurse on the left and right subtrees
        traverse(node.left, target);
        traverse(node.right, target);
    }

    private void dfs(TreeNode node, int target) {
        if (node == null) {
            return;
        }

        System.out.println("Current sum: " + target);
        if (node.val == target) {
            count++;
            System.out.println("Path found!");
        }

        // Recurse on the left and right subtrees with updated target
        dfs(node.left, target - node.val);
        dfs(node.right, target - node.val);
    }
}

//    public static void main(String[] args) {
//        // Create the tree using your Tree package implementation
//        TreeNode root = createTree(); // Modify this line based on your tree creation logic
//
//        int targetSum = 8;
//
//        pathSum solution = new pathSum();
//        int count = solution.pathSum(root, targetSum);
//
//        System.out.println("Number of paths that sum up to " + targetSum + ": " + count);
//    }
//
//    private static TreeNode createTree() {
//        // Create the following tree structure:
//        //        10
//        //       / \
//        //      5   -3
//        //     / \   \
//        //    3   2   11
//        //   / \   \
////          3  -2   1
//
//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(-3);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(2);
//        root.right.right = new TreeNode(11);
////        root.left.left.left = new TreeNode(3);
////        root.left.left.right = new TreeNode(-2);
////        root.left.right.right = new TreeNode(1);
//
//        return root;
//    }
//}