package com.company;

import java.util.Scanner;

class Found{
    public int min(int[] arr,int min){
     for(int i:arr){
         if(i<min){
             min=i;
         }
     }
     return min;
    }
}

public class FindMIn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int min=arr[0];
        System.out.println("Minimum Element is:"+new Found().min(arr,min));
    }
}
