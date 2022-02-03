package com.company;

import java.util.Arrays;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][]array={
                {1,2,3,5},
                {6,7,8,9,10},
                {11,12,14,14,15}
        };
        int max=0;
        System.out.println("Maximum element at "+ Arrays.toString(max(array,max))+" Maxium value is:"+max);
    }
    public static int[] max(int[][] array,int max){
        int ans[]=new int[2];

        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[row].length;col++){
             if(array[row][col]>max){
                 max=array[row][col];
                 ans[0]=row;
                 ans[1]=col;
             }
            }
        }

        return ans;
    }
}
