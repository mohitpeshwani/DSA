package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class OderAgnosticBS {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n= scan.nextInt();
        int[] array=new int[n];

        for(int i=0;i<n;i++){
            System.out.println(i+"th element:");
            array[i]=scan.nextInt();
        }
        int target=scan.nextInt();
        System.out.println(binarySearch(array,target));


    }
    static int binarySearch(int arr[],int target){
        //Arrays.sort(arr);
        //System.out.println("Sorted array:"+Arrays.toString(arr));
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
