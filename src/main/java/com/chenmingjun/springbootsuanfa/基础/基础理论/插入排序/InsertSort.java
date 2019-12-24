package com.chenmingjun.springbootsuanfa.基础.基础理论.插入排序;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,9,7,19,3,23,16,17,17,16,16,16,16,19};
        insertSort(arr);
    }

    public static void insertSort(int[] arr){

        for (int i = 1;i<arr.length;i++ ){
            for (int j = 0 ;j < i;j++){
                if (arr[i]<arr[j]){
                    int help = arr[i];
                    for (int k=i;k>j;k-- ){
                        arr[k]=arr[k-1];
                    }
                    arr[j] =help;
                }
            }
        }
        for (int arrs:arr) {

            System.out.println(arrs);
        }
    }


}
