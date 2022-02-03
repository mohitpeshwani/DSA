package com.company;

public class UsingEnum {
    public static void main(String[] args) {
        Show a=Show.INSTANCE;
        a.i=20;
        Show b=Show.INSTANCE;
        System.out.println(b.i);
    }
}

enum Show{
    INSTANCE;
    int i;
    public void show(){
        System.out.println(i);
    }
}
