package com.chenmingjun.springbootsuanfa.基础.基础理论.桶排序.maxGap;

public class MaxGap {

    public static void main(String[] args) {
        int[] arr = {1,2,4,10,30,20,100,60};
        System.out.println(maxGap(arr));


    }

    public static int maxGap(int[] arr){

        if (arr == null || arr.length<2) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int bid = 0;

        int[] maxs = new int[arr.length+1];
        int[] mins = new int[arr.length+1];
        boolean[] hasNums = new boolean[arr.length+1];

        for (int i = 0;i < arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        for (int i = 0;i < arr.length;i++){
            bid =(int) ((arr[i]-min)/((max-min)/arr.length+1));

            mins[bid] = hasNums[bid] ? Math.min(mins[bid], arr[i]) : arr[i];
            maxs[bid] = hasNums[bid] ? Math.max(maxs[bid], arr[i]) : arr[i];
            hasNums[bid]=true;
        }

        int res = 0;
        int lastMax = maxs[0];//记录上一个非空桶的最大值
        int i = 1;
        for (; i <= arr.length; i++) {
            if (hasNums[i]) {//当遇到桶不空的时候，就拿改桶的最小值减去上一个非空桶的最大值，这样所有的情况都涵盖了
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;

    }



}
