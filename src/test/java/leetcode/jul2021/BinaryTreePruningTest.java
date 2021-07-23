package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.jul2021.BinaryTreePruning.*;
import static leetcode.jul2021.BinaryTreePruning.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePruningTest {
    BinaryTreePruning binaryTreePruning;

    @BeforeEach
    public void setup(){
        binaryTreePruning = new BinaryTreePruning();
    }

    @Test
    public void should_return_prune_tree(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode result = binaryTreePruning.pruneTree(root);

        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(0);
        expected.right.right = new TreeNode(1);

        assertEquals(expected,result);
    }

}