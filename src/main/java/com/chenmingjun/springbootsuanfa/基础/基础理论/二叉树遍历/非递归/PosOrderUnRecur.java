package com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.非递归;

import java.util.Stack;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/23 0023 下午 8:12
 */
public class PosOrderUnRecur {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        posOrderUnRecur(head);
    }

    public static void posOrderUnRecur(Node head) {

        if (head != null) {
            Stack stack = new Stack<Node>();
            Stack help = new Stack<Node>();
            stack.push(head);
            while (!stack.isEmpty()) {
                head = (Node) stack.pop();
                help.push(head);
                if (head.left != null) {
                    stack.push(head.left);
                }
                if (head.right != null) {
                    stack.push(head.right);
                }
            }
            while (!help.isEmpty()){
                Node pop = (Node)help.pop();
                System.out.println(pop.var);
            }
        } else {
            return;
        }
    }
}
