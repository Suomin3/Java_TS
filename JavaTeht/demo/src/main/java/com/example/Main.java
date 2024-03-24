package com.example;

import java.util.ArrayList;
import java.util.HashMap;

import com.testi.T2;

import main.java.com.example.T1;
import main.java.com.example.T10;
import main.java.com.example.T3;
import main.java.com.example.T4;
import main.java.com.example.T5;
import main.java.com.example.T6;
import main.java.com.example.T7;
import main.java.com.example.T8;
import main.java.com.example.T9;

public class Main {
    public static void main(String[] args)
    {
        String emptyline = System.lineSeparator();

        System.out.println(emptyline + "Tehtävä 1");
        T1 t1 = new T1();

        System.out.println(t1.Teht1() + emptyline);
        System.out.println("Tehtävä 2");

        T2 t2 = new T2();
        t2.Teht2(5);

        System.out.println(emptyline + "Tehtävä 3");

        T3 t3 = new T3();
        System.out.println("Ympyrän pinta-ala:" + t3.Teht3C());
        System.out.println("Neliön pinta-ala: " + t3.Teht3S());
        System.out.println("Kolmion pinta-ala: " + t3.Teht3T());
        
        System.out.println(emptyline + "Tehtävä 4");

        T4 t4 = new T4();
        t4.Teht4();

        System.out.println(emptyline + "Tehtävä 5");

        T5 t5 = new T5();
        t5.Teht5();

        System.out.println(emptyline + "Tehtävä 6");

        T6 t6 = new T6();
        System.out.println(t6.Teht6("Aivot avaavat     ovia"));

        System.out.println(emptyline + "Tehtävä 7");

        T7 t7 = new T7();
        t7.Teht7(6);

        System.out.println(emptyline + "Tehtävä 8");

        T8 t8 = new T8();
        System.out.println(t8.Teht8(10));

        System.out.println(emptyline + "Tehtävä 9");

        T9 t9 = new T9();
        System.out.println(t9.Teht9(3661));

        System.out.println(emptyline + "Tehtävä 10");

        T10 t10 = new T10();
        HashMap<String, ArrayList<Integer>> generatedNumbers = t10.Teht10();

        System.out.println("Positiiviset numerot: " + generatedNumbers.get("positive"));
        System.out.println("Negatiiviset numerot: " + generatedNumbers.get("negative"));
        System.out.println("Nollat: " + generatedNumbers.get("zero"));
    }
}