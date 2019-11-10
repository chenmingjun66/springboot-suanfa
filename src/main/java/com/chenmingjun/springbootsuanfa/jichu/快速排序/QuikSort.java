package com.chenmingjun.springbootsuanfa.jichu.快速排序;

public class QuikSort {

    public static void main(String[] args) {
        int[] arr = {1,3,23,12,34,34,34,34,343,5,7,6,35,32,12,34,56,24};
        quickSort(arr);
        for (int ans:arr){
            System.out.println(ans);
        }

    }



    public static void quickSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }

        quickSort(arr,0,arr.length-1);

    }

    public static  void quickSort(int[] arr,int L,int R){

        if(L < R) {
            swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partion(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr,p[1]+1,R);
        }

    }

    public static int[] partion(int[] arr,int L,int R){

        int less = L-1;
        int more = R;

        for (int i = L;i< more;){
            if(arr[i]<arr[R]){
                if (i==0){
                    less++;
                    i++;
                }else {
                    swap(arr,i,less+1);
                    less++;
                    i++;
                }

            }
            if (arr[i] > arr[R]){
                swap(arr,i,more-1);
                more--;
            }
            if (arr[i] == arr[R]){
                i++;
            }

        }
        swap(arr,more,R);

        return new int[]{less+1,more};
    }

    public static void swap(int[] arr,int L, int R){
        int help = arr[L];
        arr[L] = arr[R];
        arr[R] = help;

    }

}
