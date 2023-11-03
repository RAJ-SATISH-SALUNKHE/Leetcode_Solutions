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

    int depth = 0;
    int maxDepth = 0;

    void Traverse(TreeNode root, int idx)
    {
        if(root == null)
        {
            depth = idx;
            if(idx > maxDepth)
            {
                maxDepth = idx;
            }

            return;
        }

        Traverse(root.left, idx + 1);
        Traverse(root.right, idx + 1);
    }


    public int maxDepth(TreeNode root) {

        Traverse(root, 0);

        System.out.println(maxDepth);

        return maxDepth;
        
    }
}