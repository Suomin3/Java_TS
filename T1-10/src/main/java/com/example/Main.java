package com.example;

public class Main
{
    public static void main( String[] args )
    {
        double x1 = 0, x2 = 0, y1 = 0, y2 = 0;

        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("Kahden pisteen välinen etäisyys on: " + distance);
    }
}