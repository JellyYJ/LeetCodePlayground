package Tree;

public class LongestUnivaluePath {
    int len = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return len;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        int leftEdge = 0, rightEdge = 0;
        if (root.left != null && root.left.val == root.val) {
            leftEdge = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            rightEdge = right + 1;
        }

        len = Math.max(len, leftEdge + rightEdge);

        System.out.println("Node: " + root.val);
        System.out.println("Left Edge: " + leftEdge);
        System.out.println("Right Edge: " + rightEdge);
        System.out.println("Current Max Length: " + len);

        return Math.max(leftEdge, rightEdge);
    }
}
