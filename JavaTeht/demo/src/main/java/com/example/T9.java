package main.java.com.example;

public class T9 {
    public String Teht9(int time) {
        int hours = time / 3600;
        int remaining = time % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}