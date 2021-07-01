package leetcode.jun2021;

public class LowestCommonAncestorBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLCA(root, p, q);
    }

    TreeNode findLCA(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return null;

        if(node.val == p.val || node.val == q.val) return node;

        TreeNode left = findLCA(node.left, p, q);
        TreeNode right = findLCA(node.right, p, q);

        if(left != null && right != null) return node;

        return (left != null) ? left : right;
    }
}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
