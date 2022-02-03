package com.company;

public class Reverseno {
    public static void main(String[] args) {
        int no=123;
        int rem=0;
        int rev=0;
        while(no>0){
            rem=no%10;
            rev=rev*10+rem;
            no=10;
        }
        System.out.println(rev);
    }
}
