package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Builder b= new Builder.UserBuilder("Mohit","Peshwani",42).build();
        System.out.println(b.getLname());
        System.out.println(b.getFname());
        System.out.println(b.getAddress());
        System.out.println(b.getAge());

    }
}
