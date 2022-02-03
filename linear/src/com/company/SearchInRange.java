package com.company;

import java.util.Scanner;



public class SearchInRange {
    public static void main(String[] args) {
        System.out.println("Enter the no of Elements in array");
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();
        int[] array=new int[no];
        for(int i=0;i<no;i++){
            System.out.println(i+"th element:");
            array[i]= scan.nextInt();
        }
        System.out.println("Enter the range to start and end no:");
        int first= scan.nextInt();
        int last= scan.nextInt();
        System.out.println("Enter the Element to be found in the range");
        int target=scan.nextInt();
        System.out.println(search(array,target,first,last));
    }

    public static  boolean search(int arr[],int target,int first,int l){
        for(int i=first;i<l;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

}
