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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int hRight = heigth(root.right);
        int hLeft = heigth(root.left);

        if (hRight - hLeft > 0) {
            return hRight;
        }

        return hLeft;
    }

    public int heigth(TreeNode root) {
        if (root == null) return 1;

        int hRight = heigth(root.right);
        int hLeft = heigth(root.left);

        int maior;

        if (hRight > hLeft) {
            maior = hRight;
        } else {
            maior = hLeft;
        }

        return 1 + maior;
    }
}