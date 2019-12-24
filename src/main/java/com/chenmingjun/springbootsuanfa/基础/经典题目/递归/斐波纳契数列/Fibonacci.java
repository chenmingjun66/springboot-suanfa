package com.chenmingjun.springbootsuanfa.基础.经典题目.递归.斐波纳契数列;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/24 0024 上午 11:07
 */
public class Fibonacci {

    public static  int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static void main(String[] args) {
        int fibonacci = fibonacci(6);
        System.out.println(fibonacci);

    }
}
