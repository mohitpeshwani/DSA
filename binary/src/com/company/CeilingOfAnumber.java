package com.company;

import java.util.Scanner;

public class CeilingOfAnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int target= scan.nextInt();
        System.out.println(ceilingBS(arr,target));
    }

    static int ceilingBS(int arr[],int target){
        int start=0,end=arr.length-1;
        boolean asc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return arr[start];
            }
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=end-1;
                }
         } return arr[start];
    }
}
