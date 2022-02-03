package com.company;
import java.util.Arrays;
import java.util.Scanner;



public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int no= scan.nextInt();
        int[] arr=new int[no];
        for(int i=0;i<no;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("Element to be targeted: ");
        int target=scan.nextInt();
        int result=binarysearch(arr,target);
        System.out.println(result);
    }
    static int binarysearch(int[] array,int target){
        Arrays.sort(array);
        System.out.println("Sorted Array like:");
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(target>array[mid]){
                start=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
