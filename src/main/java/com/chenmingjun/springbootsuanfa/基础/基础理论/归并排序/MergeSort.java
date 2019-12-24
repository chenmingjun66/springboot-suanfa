package com.chenmingjun.springbootsuanfa.基础.基础理论.归并排序;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {2,7,4,15,11,45,32,23,343,343,23,23,23,2323,234,234,123,23,34,45,89};
        sortProcess(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }



    }

   public static void  sortProcess(int[] arr,int L,int R){


        if (L == R){
            return;
        }

        int mid = L + ((R-L)>>1);

        sortProcess(arr,L, mid);    //左边排好
        sortProcess(arr,mid+1,R);    //右边排好
        merge(arr,L,mid,R);     //整体排好，外排(双指针，边放边排)

    }

    public static void merge(int[] arr,int L,int mid,int R){



        int[] helpe = new int[R-L+1];

        int p1 = L;
        int p2 = mid+1;
        int i = 0;
        while(p1 <= mid && p2 <= R ){

            if (arr[p1] <= arr[p2]){
                helpe[i]=arr[p1];
                p1++;
                i++;
            }else {
                helpe[i]= arr[p2];
                p2++;
                i++;
            }

        }

        while (mid< p1 && p2 <= R){
            helpe[i]=arr[p2];
            p2++;
            i++;
        }

        while (p2 > R && p1<=mid){
            helpe[i]=arr[p1];
            p1++;
            i++;
        }

        for (int j=0 ;j<R-L+1 ;j++){
            arr[j+L]=helpe[j];

        }


    }

}
