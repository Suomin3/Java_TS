package main.java.com.example;

public class T7 {
    public int Teht7(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        int result = (int)Math.round((Math.pow(phi, n) - Math.pow(1 - phi, n)) / Math.sqrt(5));

        System.out.println(result);

        return result;
    }
}