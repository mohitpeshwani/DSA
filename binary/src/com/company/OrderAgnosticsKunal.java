package com.company;

import java.util.Scanner;

public class OrderAgnosticsKunal {
    public static void main(String[] args) {
        int arr1[]={
                10,20,40,50
        };
        int[] arr2={
                50,30,10
        };
        Scanner scan=new Scanner(System.in);
        int target=scan.nextInt();
        System.out.println(binarySearch(arr1,target));
        System.out.println(binarySearch(arr2,target));

    }
    static int binarySearch(int arr[],int target){
        int start=0,end=arr.length-1;
        boolean asc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(asc){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=end-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=end-1;
                }
            }
        } return -1;
    }
}
