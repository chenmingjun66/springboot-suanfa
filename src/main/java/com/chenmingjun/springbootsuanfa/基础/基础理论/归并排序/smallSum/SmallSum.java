package com.chenmingjun.springbootsuanfa.基础.基础理论.归并排序.smallSum;

public class SmallSum {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        int i = SmallSum(arr,0,arr.length-1);
        System.out.println(i);

    }


    public static  int SmallSum(int[] arr,int L,int R){


        if (L==R){
            return 0;
        }

        int mid = L+((R-L)>>1);

        return SmallSum(arr,L,mid)+SmallSum(arr,mid+1,R)+mergeSort(arr,L,mid,R);
    }


    public static  int mergeSort(int[] arr,int L,int mid,int R){
        int[] helpe = new int[R-L+1];

        int p1 = L;
        int p2 = mid+1;
        int i = 0;
        int ans=0;
        while(p1 <= mid && p2 <= R ){




            if (arr[p1] <arr[p2]){
                ans += (R - p2 + 1)*arr[p1];

                helpe[i]=arr[p1];
//                ans = ans +arr[p1];
                p1++;
                i++;
            }else {
                helpe[i]= arr[p2];
                p2++;
                i++;
            }

        }
//        if (mid< p1 && p2 <= R){
//            for (int k = L ;k<mid+1;k++){
//                ans = ans + arr[k]*(R-p2);
//
//            }
//        }
        while (mid< p1 && p2 <= R){
            helpe[i]=arr[p2];
            p2  = p2 +1;
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

        return ans;

    }








}
