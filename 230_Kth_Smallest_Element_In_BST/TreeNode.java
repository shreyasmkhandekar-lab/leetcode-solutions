
// Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ioList = new ArrayList<>();
        helper(root, ioList);

        return ioList.get(k - 1);
    }

    private void helper(TreeNode root, List<Integer> ioList) {
        if (root == null)
            return;

        helper(root.left, ioList);
        ioList.add(root.val);
        helper(root.right, ioList);
    }

}