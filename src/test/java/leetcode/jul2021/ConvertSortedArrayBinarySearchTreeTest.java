package leetcode.jul2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayBinarySearchTreeTest {
    ConvertSortedArrayBinarySearchTree convertSortedArrayBinarySearchTree;

    @BeforeEach
    public void setup(){
        convertSortedArrayBinarySearchTree = new ConvertSortedArrayBinarySearchTree();
    }

    @Test
    public void should_return_a_binary_tree(){
        TreeNode result = convertSortedArrayBinarySearchTree.accept(new int[]{-10,-3,0,5,9});
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-10);
        expected.left.right = new TreeNode(-3);
        expected.right = new TreeNode(5);
        expected.right.right = new TreeNode(9);

        assertEquals(expected, result);
    }

}