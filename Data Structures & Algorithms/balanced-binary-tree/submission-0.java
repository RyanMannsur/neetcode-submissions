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
    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;

        int hRight = heigth(root.right);
        int hLeft = heigth(root.left);

        if (Math.abs(hRight - hLeft) > 1) {
            return false;
        }

        return (isBalanced(root.left) && isBalanced(root.right));
    }

    public int heigth(TreeNode root) {
        if (root == null) return 0;

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