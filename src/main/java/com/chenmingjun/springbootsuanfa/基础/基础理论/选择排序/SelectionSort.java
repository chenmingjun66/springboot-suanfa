package com.chenmingjun.springbootsuanfa.基础.基础理论.选择排序;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,9,10,23,32};
        selection(arr);


    }



    public static void selection(int[] arr){


        int help;
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    help=arr[j];
                    arr[j] = arr[i];
                    arr[i] = help;
                }
            }
        }

        for (int arrs:arr){
            System.out.println(arrs);
        }
    }


}
