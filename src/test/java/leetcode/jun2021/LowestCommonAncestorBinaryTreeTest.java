package leetcode.jun2021;

import leetcode.jun2021.LowestCommonAncestorBinaryTree;
import leetcode.jun2021.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorBinaryTreeTest {
    LowestCommonAncestorBinaryTree lowestCommonAncestorBinaryTree;

    @BeforeEach
    public void setup(){
        lowestCommonAncestorBinaryTree = new LowestCommonAncestorBinaryTree();
    }

    @Test
    public void should_find_the_lowest_common_ancestor(){
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode result= lowestCommonAncestorBinaryTree.lowestCommonAncestor(root, p, q);

        assertEquals(3,result.val);
    }

}