package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());

	 }
}

class Singleton{
   //public static Singleton s=new Singleton(); //eager
   public static Singleton s;// Lazy
    private Singleton(){
        System.out.println("This is the same object");
    }
    public static Singleton getInstance(){
        if(s==null){
            s=new Singleton();
        }
        return s;
    }
}
