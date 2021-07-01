package leetcode.jun2021;

import leetcode.jun2021.ConstructBinaryTreePreorderInorderTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreePreorderInorderTraversalTest {
    ConstructBinaryTreePreorderInorderTraversal constructBinaryTreePreorderInorderTraversal;

    @BeforeEach
    public void setup() {
        constructBinaryTreePreorderInorderTraversal = new ConstructBinaryTreePreorderInorderTraversal();
    }

    @Test
    public void should_Construct_Binary_Tree() {
        ConstructBinaryTreePreorderInorderTraversal.TreeNode result = constructBinaryTreePreorderInorderTraversal.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        ConstructBinaryTreePreorderInorderTraversal.TreeNode expectTree = new ConstructBinaryTreePreorderInorderTraversal.TreeNode(3);
        expectTree.left = new ConstructBinaryTreePreorderInorderTraversal.TreeNode(9);
        expectTree.right = new ConstructBinaryTreePreorderInorderTraversal.TreeNode(20);
        expectTree.right.left = new ConstructBinaryTreePreorderInorderTraversal.TreeNode(15);
        expectTree.right.right = new ConstructBinaryTreePreorderInorderTraversal.TreeNode(7);
        assertEquals(expectTree, result);
    }
}