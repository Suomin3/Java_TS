package main.java.com.example;

public class T6 {
    public boolean Teht6(String isPal) {
        String cleanString = isPal.replaceAll("\\s", "").toLowerCase();
    
    String reverse = "";

    int length = cleanString.length();
    for(int i = length - 1; i >= 0; i--)
        reverse = reverse + cleanString.charAt(i);

    if(cleanString.equals(reverse))
        return true;
    else
        return false;
    }
}