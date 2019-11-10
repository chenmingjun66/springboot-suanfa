package com.chenmingjun.springbootsuanfa.jichu.快速排序.demo1;

public class Partition1 {



    public static void  partition1(int[] arr,int L,int R){
        int p = arr[R];
        int less = L-1;//小于等于区右边界

        for (int i=L;i<=R;i++){
            if (arr[i] <= p){
                swap(arr,++less,i);
            }

        }


    }


}
