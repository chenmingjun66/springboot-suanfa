package com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.非递归;

import java.util.Stack;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/23 0023 下午 5:17
 */
public class InOrderUnRecur {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        inOrderUnRecur(head);
    }




    public  static  void inOrderUnRecur(Node head){

       if (head != null) {
           Stack stack = new Stack<Node>();
           while (!stack.isEmpty() || head != null) {
               if (head != null) {
                   stack.push(head);
                   //stack.push(head.var);
                   head = head.left;
               }else {
                   head = (Node) stack.pop();
                   System.out.println(head.var);
                   head = head.right;
               }
           }
       }else {
           return;
       }
    }
}
