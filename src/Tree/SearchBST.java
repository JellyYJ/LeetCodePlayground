package Tree;

import Tree.TreeNode;

public class SearchBST {
    public static void main(String[] args) {
//                5
//               / \
//              3   8
//             / \   \
//            2   4   10
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(10);

        int valToFind = 8;
        TreeNode result = searchBST(root, valToFind);

        if (result != null) {
            System.out.println("Node found: " + result.val);
            // If you want to print the entire subtree rooted at the found node:
            printSubTree(result);
        } else {
            System.out.println("Node not found for value: " + valToFind);
        }
    }
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        System.out.println(root.val);
        if (root.val == val) return root;
        // Search left subtree if the current node is greater than target
        if (root.val > val) {
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }
    }


    public static void printSubTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printSubTree(node.left);
        printSubTree(node.right);
    }

}
