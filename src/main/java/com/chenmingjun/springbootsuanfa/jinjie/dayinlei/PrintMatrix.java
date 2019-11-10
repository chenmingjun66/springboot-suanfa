package com.chenmingjun.springbootsuanfa.jinjie.dayinlei;

public class PrintMatrix {

    public static void main(String[] args) {
            int[][] arrs={{1,2,3,4},{5,6,0,3},{1,7,2,6}};
            printMatrix(arrs);
    }
    
    public static void printMatrix(int[][] arrs){
        if (arrs.length==0 ){
            System.out.print("空数组");
            return;
        }
        if (arrs.length == 1  ){
            for (int i =0;i<arrs[0].length;i++){
            System.out.print(arrs[0][i]);
            }
            return;

        }

        int row1=0,col1=0;
        int row2=0,col2=0;
        int flag=1;
        int endR = arrs.length-1;
        int endC = arrs[0].length-1;

        while (row1 <= endR){
            print(arrs,row1,col1,row2,col2,flag);
            if (col1 <endC){
                col1++;

            }else {
                row1++;
            }
            if (row2 < endR){
                row2++;
            }else {
                col2++;
            }
            flag = -flag;
        }
    }

    public  static void print(int[][] arrs,int row1,int col1,int row2,int col2,int flag){

        if (flag==1){
            for (int i = row2,j = col2;row1 <= i;i--,j++ ){
                System.out.println(arrs[i][j]);

            }
        }
        if (flag == -1){
            for (int i = row1,j = col1;j >= col2;i++,j-- ){
                System.out.println(arrs[i][j]);

            }
        }
    }
}
