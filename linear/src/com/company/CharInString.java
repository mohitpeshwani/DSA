package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

class Search{
    public int search(String str,char target){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==target)
                return i;
            }
        return -1;
        }

    }

public class CharInString {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str= scan.nextLine();
        System.out.println("Enter the Char to be found:");
        char ch=scan.nextLine().charAt(0);
        Search s=new Search();
        int answer=s.search(str,ch);
        if(answer==-1){
            System.out.println("Element Not found");
        }
        else{
            System.out.println("Element Found at the "+answer);
        }
    }
}
