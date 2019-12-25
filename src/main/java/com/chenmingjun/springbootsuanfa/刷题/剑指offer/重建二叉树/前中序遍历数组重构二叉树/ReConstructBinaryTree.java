package com.chenmingjun.springbootsuanfa.刷题.剑指offer.重建二叉树.前中序遍历数组重构二叉树;

import com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.递归遍历.PostOrderTraversal;
import com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.递归遍历.PreOrderTraversal;
import com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.非递归.Node;

import java.util.Arrays;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/25 0025 上午 9:44
 */
public class ReConstructBinaryTree {
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Node node = reConstructBinaryTree(pre, in);
        System.out.println(node);
//        PreOrderTraversal.preOrderTraversal(node);
        PostOrderTraversal.postOrderTraversal(node);
    }


/*====================================第一次练习=================================*/
/*    public static  Node reConstructBinaryTree(int [] pre, int [] in) {

        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        Node tree = new Node(pre[0]);

        int mid = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                mid = i;
                break;
            }
        }
        tree.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,mid+1),Arrays.copyOfRange(in,0,mid));
        tree.right = reConstructBinaryTree(Arrays.copyOfRange(pre,mid+1,pre.length),Arrays.copyOfRange(in,mid+1,in.length));
        return tree;
    }*/



/*====================================第二次练习======================================*/



    public static Node reConstructBinaryTree(int[] pre ,int[] in){

        if (pre.length==0){
            return null;

        }

        Node tree = new Node(pre[0]);

        int mid = 0 ;
        for (int i = 0; i < pre.length;i++ ){
            if(pre[0] == in[i]){
                mid = i;
                break;
            }
        tree.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,mid+1),Arrays.copyOfRange(in,0,mid));
        tree.right = reConstructBinaryTree(Arrays.copyOfRange(pre,mid+1,pre.length),Arrays.copyOfRange(in,mid+1,in.length));
        }
        return tree;
    }




}
