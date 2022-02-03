package com.company;
//client
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sides of the polygon");
        int sides= scan.nextInt();
        Polygon polygon=PolygonFactory.getInstance(sides);
        System.out.println(polygon.getPolygon());
	 }
}
