package com.testi;

public class T3
{
    public static void circle()
    {
        double rad = 3;

        double crclarea = (Math.PI * rad * rad);

        System.out.println("Ympyrän pinta-ala on: " + crclarea);
    }
    public static void square()
    {
        double sqrlength = 3;

        double sqrarea = (sqrlength * sqrlength);

        System.out.println("Neliön pinta-ala on: " + sqrarea);
    }
    public static void triangle()
    {
        double height = 3;
        double base = 3;

        double trianglearea = (base * height / 2);

        System.out.println("Kolmion pinta-ala on: " + trianglearea);
    }
    public static void main(String[] args)
    {
        circle();
        square();
        triangle();
    }
}
