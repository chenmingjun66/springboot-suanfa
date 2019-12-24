package com.chenmingjun.springbootsuanfa.基础.基础理论.堆排序;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {5,7,0,6,8,13,45,32,2134,34,23,1,2,1,2,3,1,3,3,4,4,3,5,5};
        heapSort(arr);

        for (int ans : arr){
            System.out.println(ans);
        }
    }


    public static void heapSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        heapInsert(arr);
        int size = arr.length;
        swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }

    }

    public static void heapify(int[] arr, int index, int size) {
        int left = index*2+1;
        while(left < size){
            if(left+1<size && (arr[left+1] > arr[left])){
                swap(arr,left+1,index);
                index = left+1;
                left = index*2+1;
            }else {
                swap(arr,left,index);
                index =left;
                left = index*2+1;
            }
        }

    }

    public static void heapInsert(int[] arr){
        for (int i=0;i<arr.length;i++){
            int index = i;
            while (arr[index]>arr[(index-1)/2]){
                swap(arr,index,(index-1)/2);
                index = (index-1)/2;
            }

        }




    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }

}
