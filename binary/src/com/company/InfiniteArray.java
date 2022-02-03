package com.company;

public class InfiniteArray {
    public static void main(String[] args) {

    }

    static int binarySearch(int arr[],int target,int start,int end){
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
