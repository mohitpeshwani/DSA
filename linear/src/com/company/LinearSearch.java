package com.company;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class LinearSearch {
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number of elements");
    int n=scan.nextInt();
    int[] array=new int[n];
    for(int i=0;i<n;i++){
        System.out.println(i+"th element:");
        array[i]= scan.nextInt();
    }
    System.out.println("Enter the Element to be found");
    int target=scan.nextInt();
    System.out.println(linearSearch(array,target));
}
public static boolean linearSearch(int arr[], int target){
    for(int i: arr){
        if(target==i){
            return true;
        }
        else{
            continue;
        }
    }
    return false;

}

}
