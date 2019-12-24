package com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.非递归;

import java.util.Stack;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/23 0023 下午 7:26
 */
public class PreOrderUnRecur {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        preOrderUnRecur(head);
    }

    public static void preOrderUnRecur(Node head){

        if (head != null){
            Stack stack = new Stack<Node>();
            stack.push(head);
            while (!stack.isEmpty()){
                head = (Node)stack.pop();
                System.out.println(head.var);
                if (head.right != null){
                    stack.push(head.right);
                }
                if (head.left != null){
                    stack.push(head.left);
                }
            }
        }else {
            return;
        }
    }
}
