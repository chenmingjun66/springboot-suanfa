package com.chenmingjun.springbootsuanfa.基础.经典题目.二叉树问题;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/23 0023 下午 8:56
 */

/*
 * 使用二叉树的中序遍历思想来求解
 * */
/*=======================================第一次练习===========================================*/
/*public class PrintAllFolds {

    public static void  printAllFolds(int N){
        printProcess(1,N,true);
    }

    public static void printProcess(int i,int N,boolean down){
        if(i > N){
            return;
        }
        printProcess( i+1,N,true);
        System.out.println(down?"下":"上");
        printProcess(i+1,N,false);

    }

    public static void main(String[] args){
        int N = 3;
        printAllFolds(N);
    }
}*/


/*=======================================第二次练习===========================================*/

public class PrintAllFolds {
    public static void main(String[] args) {


    }



    public static void printAllFolds(int N){
        boolean down =true;
        printProcess(1,N,down);
    }

    public static void printProcess(int i ,int N,boolean down){

        if (i>N){
            return;
        }
        printProcess(i+1,N,true);
        System.out.println(down?"down":"up");
        printProcess(i+1,N,false);
    }
}









