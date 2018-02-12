package com.crossoverjie.leetcode.easy;

/**
 * Function:二叉树的高度
 *
 * @author crossoverJie
 *         Date: 11/02/2018 09:57
 * @since JDK 1.8
 */
public class TreeDepth {


    /**
     * 递归求树的深度
     * @param binaryNode
     * @return
     */
    public int depth(BinaryNode binaryNode){


        if (binaryNode == null){
            return 0 ;
        }

        int leftDepth = depth(binaryNode.getLeft());

        int rightDepth = depth(binaryNode.getRight());

        if (leftDepth > rightDepth){
            return leftDepth + 1 ;
        }else {
            return rightDepth + 1;
        }
    }


    public static class BinaryNode {
        private Object data;
        private BinaryNode left;
        private BinaryNode right;

        public BinaryNode(Object data, BinaryNode left, BinaryNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public BinaryNode getLeft() {
            return left;
        }

        public void setLeft(BinaryNode left) {
            this.left = left;
        }

        public BinaryNode getRight() {
            return right;
        }

        public void setRight(BinaryNode right) {
            this.right = right;
        }

    }

}
