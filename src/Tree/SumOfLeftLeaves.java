package Tree;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        System.out.println("Current Node: " + root.val);

        // Base case: if root is null, return 0
        if (root == null) {
            return 0;
        }

        // Base case: if root is a leaf node, return 0
        if (root.left == null && root.right == null) {
            return 0;
        }

        int sum = 0;
        // Check if the left child is a leaf node
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = sum + root.left.val;
            System.out.println("Found a leaf: " + sum);
        }


        // Recursively calculate the sum of left leaves in the left and right subtrees
        int leftSum = sumOfLeftLeaves(root.left);
        int rightSum = sumOfLeftLeaves(root.right);

        // Print the current node's value and the sum of left leaves
        System.out.println("Sum of Left Leaves: " + (sum + leftSum));

        // Return the total sum of left leaves
        return sum + leftSum + rightSum;
    }

}
