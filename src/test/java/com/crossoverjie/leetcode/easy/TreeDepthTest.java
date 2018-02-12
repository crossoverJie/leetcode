package com.crossoverjie.leetcode.easy;

import org.junit.Test;
import static com.crossoverjie.leetcode.easy.TreeDepth.BinaryNode;

public class TreeDepthTest {
    @Test
    public void depth() throws Exception {

        BinaryNode node = new BinaryNode("1", null, null);
        BinaryNode left2 = new BinaryNode("2", null, null);
        BinaryNode left3 = new BinaryNode("3", null, null);
        BinaryNode left4 = new BinaryNode("4", null, null);
        BinaryNode left5 = new BinaryNode("5", null, null);
        BinaryNode left6 = new BinaryNode("6", null, null);

        node.setLeft(left2);
        node.setRight(left3);
        left2.setLeft(left4);
        left4.setLeft(left6);
        left3.setLeft(left5);

        TreeDepth treeDepth = new TreeDepth() ;
        int depth = treeDepth.depth(node);
        System.out.println(depth);

    }

}