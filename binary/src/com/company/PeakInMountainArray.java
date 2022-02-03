package com.company;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int array[]={0,2,3,4,5,6,7,8,7,6,5,5,4};
        System.out.println(peakIntheMountain(array));

    }
    public static int peakIntheMountain(int array[]){
        int start=0,end=array.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(array[mid]>array[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
