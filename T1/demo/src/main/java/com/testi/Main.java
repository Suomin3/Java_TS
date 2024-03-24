package com.testi;

public class Main {
    public static void main(String[] args)
    {
        double x1 = 0.0;
        double x2 = 0.0;
        double y1 = 0.0;
        double y2 = 3.0;

        double lasku = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("Vastaus: " + lasku);
    }
}