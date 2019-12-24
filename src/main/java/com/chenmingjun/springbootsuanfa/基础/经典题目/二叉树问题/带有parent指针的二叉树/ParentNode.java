package com.chenmingjun.springbootsuanfa.基础.经典题目.二叉树问题.带有parent指针的二叉树;



import javax.validation.constraints.NotNull;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/24 0024 上午 10:31
 */
public class ParentNode {
    public static void main(String[] args) {

    }


    public static Node getSuccessorNode(Node node){
        if (node == null){
         return null;
        }
        if (node.right != null){
            Node leftMost = getLeftMost(node);
            return leftMost;
        }else {
            Node parent = node.parent;
            while (parent != null && parent.left != node) {
                node = parent;
                parent = node.parent;
            }
            return parent;
        }

    }


    public static Node getLeftMost(Node node){
        if (node == null){
            return node;
        }

        while (node.left != null){
            node = node.left;
        }
        return node;
    }
}
