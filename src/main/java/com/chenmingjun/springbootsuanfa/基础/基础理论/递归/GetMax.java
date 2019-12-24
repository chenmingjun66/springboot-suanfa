package com.chenmingjun.springbootsuanfa.基础.基础理论.递归;

public class GetMax {

    public static void main(String[] args) {

        int[] arr = {1,2,3,8,49,23};

        int i = getMax(arr);
        System.out.println(i);
    }

    public static int getMax(int[] arr){

     return   helper(arr,0,arr.length-1);

    }

    public static int helper(int[] arr,int L,int R){

        if(R==L){
            return arr[L];
        }
        int mid = L + (R-L)/2;
        int left = helper(arr,L,mid);
        int right = helper(arr,mid+1,R);
        return Math.max(left,right);
    }

}
