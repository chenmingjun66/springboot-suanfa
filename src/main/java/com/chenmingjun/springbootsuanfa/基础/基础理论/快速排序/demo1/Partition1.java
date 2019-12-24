package com.chenmingjun.springbootsuanfa.基础.基础理论.快速排序.demo1;

import static com.chenmingjun.springbootsuanfa.基础.基础理论.堆排序.HeapSort.swap;

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
