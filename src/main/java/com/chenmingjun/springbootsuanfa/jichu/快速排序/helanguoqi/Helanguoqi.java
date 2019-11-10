package com.chenmingjun.springbootsuanfa.jichu.快速排序.helanguoqi;

public class Helanguoqi {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,5,5,3,9,12,15,6,8,8,9};
        int[] ans = partition(arr,0,arr.length-1,5);
        int l = ans[0];
        int r =ans[1];



    }
    public static int [] partition(int[] arr, int l, int r, int p) {
        int less = l - 1;
        int more = r + 1;
        while (l < more) {
            if (arr[l] < p) {
                swap(arr, ++less, l++);
            } else if (arr[l] > p) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        return new int[] { less + 1, more - 1 };
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
