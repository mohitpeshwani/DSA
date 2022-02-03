package com.company;

public class PolygonFactory  {
   public static Polygon getInstance(int sides){
       Polygon poly=null;
       if(sides==3){
           poly=new Triangle();
       }if(sides==4){
           poly=new Rectangle();
       }if(sides==3){
           poly=new Pentagon();
       }
       else{
           System.out.println("Choose from 3,4,5");
       }
       return poly;
   }


}
