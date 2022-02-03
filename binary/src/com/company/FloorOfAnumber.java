package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfAnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        int target= scan.nextInt();
        System.out.println(floorBS(arr,target));
    }

    static int floorBS(int arr[],int target){
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
        boolean asc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                return arr[end];
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=end-1;
            }
        } return arr[end];
    }

}
