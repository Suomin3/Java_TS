package main.java.com.example;

import java.util.ArrayList;

public class T8 {
    public ArrayList<Integer> Teht8(int number) {
        ArrayList<Integer> primes = new ArrayList<>();

        int midpoint = (int) Math.ceil(number / 2.0);

        for (int i = midpoint; i <= number; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
