package com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.递归遍历;

import com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.非递归.Node;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/24 0024 上午 9:04
 */
public class InOrderTraversal {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        inOrderTraversal(head);
    }

    public static void inOrderTraversal(Node head){
        if (head == null){
            return;
        }
        inOrderTraversal(head.left);
        System.out.println(head.var);
        inOrderTraversal(head.right);
    }
}
