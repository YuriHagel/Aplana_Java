package Collections;

import java.io.FileInputStream;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Sort {
    public static void Homework6() {
        FileInputStream file;
        try {
            file= new FileInputStream("D:\\ForSort");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        file.close();
//         Sort in alphabetical order and count how many times the word repeats in the text.
        String[] ns = text.split(" ");
        NavigableMap<String, Integer> ss = new TreeMap<String, Integer>();
        for (String value : ns)
            ss.put(value, 0);
        for (Map.Entry<String, Integer> pair : ss.entrySet()) {
            int count = 0;
            for (String value : ns) {
                if (pair.getKey().equals(value))
                    count++;
            }
            pair.setValue(count);
        }
        // Display statistics on the console
        for (Map.Entry<String, Integer> pair : ss.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
        // We find the word with the maximum number of repetitions.
        int max = 0;
        for (Map.Entry<String, Integer> pair : ss.entrySet()) {
            if (max < pair.getValue()) max = pair.getValue();
        }
        // Output to the console word with the maximum number of repetitions and the number of times it was rebutted in the file.
        for (Map.Entry<String, Integer> pair : ss.entrySet()) {
            if (max == pair.getValue())
                System.out.println("\nMost often used word: " + pair.getKey() + ".\nUsed " + pair.getValue() + " times.");

        }
    }
}
