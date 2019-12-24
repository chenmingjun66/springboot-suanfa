package com.chenmingjun.springbootsuanfa.刷题.剑指offer.二维数组中找数;

/**
 * @author chenmingjun
 * @version 1.0
 * @date 2019/12/23 0023 上午 10:28
 */
public class Find {

    public boolean find(int target, int[][] array) {
        for (int i = 0, j = array[0].length - 1; i < array.length && j > 0; ) {
            if (target != array[i][j]) {
                if (target > array[i][j]) {
                    i++;
                }else {
                if (target < array[i][j]) {
                    j--;
                }
                }

            } else {
                return true;
            }
        }
            return false;
    }
}
