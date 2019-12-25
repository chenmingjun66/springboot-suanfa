package com.chenmingjun.springbootsuanfa.刷题.剑指offer.重建二叉树.搜索二叉树后序遍历重建二叉树;

import com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.递归遍历.PostOrderTraversal;
import com.chenmingjun.springbootsuanfa.基础.基础理论.二叉树遍历.非递归.Node;
import sun.security.util.Length;

import java.util.Arrays;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/25 0025 上午 10:42
 */
public class ReConstructBinaryTree {

    public static void main(String[] args) {
        int[] arr = {4,6,5,9,8,7};
        Node node = reconstructBinaryTree(arr);
        PostOrderTraversal.postOrderTraversal(node);
    }




    public static Node reconstructBinaryTree(int[] post){

        if (post.length == 0){
            return null;
        }
        int mid = 0;
        for (int i = 0;i  < post.length;i++){
            if(post[i] > post[post.length-1] ){
                mid =i;
            }
        }
        Node treeNode = new Node(post[post.length-1]);
        treeNode.left = reconstructBinaryTree(Arrays.copyOfRange(post,0,mid));
        treeNode.right = reconstructBinaryTree(Arrays.copyOfRange(post,mid,post.length-1));
        return treeNode;
    }
}
