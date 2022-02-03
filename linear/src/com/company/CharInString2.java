package com.company;

import java.util.Scanner;

public class CharInString2 {
    public static boolean search(String str,char target){
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=scan.nextLine();
        System.out.println("enter the char to search in the string:");
        char target=scan.nextLine().trim().charAt(0);
        boolean bool=search(s,target);
        if(bool==true){
            System.out.println("Character found in the entered string");

        }
        else{
            System.out.println("Character Not Found in the entered string");
        }
    }
}
