package com.company;

import java.util.Scanner;

class Linear2D{
    public boolean search(int [][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
public class SearchIn2D {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[][]array=new int[n][n];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=scan.nextInt();
            }
            int target= scan.nextInt();
            System.out.println(new Linear2D().search(array,target));
        }
    }
}
