package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class SearchIn2D2 {
    public static void main(String[] args) {
     int[][] array={
             {1,2,3,6},
             {5,6,7,8,9},
             {1,2,3,3,55}
     };
     int target=5;
     int[] answer=answer(array,target);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] answer(int[][]array,int target){
        for(int row=0;row<array.length;row++){
            for(int col=0;col<array[row].length;col++){
                if(target==array[row][col])
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
