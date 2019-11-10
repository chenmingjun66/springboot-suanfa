package com.chenmingjun.springbootsuanfa.jichu.题目.findNumK;

public class FindNumk {

    public static void main(String[] args) {

        int[][] arrs={{3,5,7,9},{5,6,8,10},{6,10,12,14}};
        int value = 6;
        boolean v = findK(arrs,6);
        System.out.println(v);


    }

    public static boolean findK(int[][] arrs,int value){

        int left = arrs[0].length-1;
        int down = 0;

        while (left >= 0 || down <= arrs.length-1 ){
            if (arrs[down][left] > 6){
                left--;
            }

            if (arrs[down][left] < 6){
                down++;
            }
            if (arrs[down][left] == 6){
                return true;
            }

        }
        return false;
    }

}
