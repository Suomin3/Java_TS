package main.java.com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class T10 {
    public HashMap<String, ArrayList<Integer>> Teht10() {
        HashMap<String, ArrayList<Integer>> numberMap = new HashMap<>();

        numberMap.put("negative", new ArrayList<>());
        numberMap.put("positive", new ArrayList<>());
        numberMap.put("zero", new ArrayList<>());

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(101) - 50;
            
            if (randomNumber < 0) {
                numberMap.get("negative").add(randomNumber);
            } else if (randomNumber > 0) {
                numberMap.get("positive").add(randomNumber);
            } else {
                numberMap.get("zero").add(randomNumber);
            }
        }
        Collections.sort(numberMap.get("negative"));
        Collections.sort(numberMap.get("positive"));

        return numberMap;
    }
}
