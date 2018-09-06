package cs3219;

import java.util.*;
import java.io.*;

public class InputFilter {
    private ArrayList<String> wordsToIgnore;
    private ArrayList<String> titles;

    public InputFilter() {
        wordsToIgnore = new ArrayList<String>();
        titles = new ArrayList<String>();
    }

    public void readInput() {
        Scanner sc = new Scanner(System.in);
        //read words to ignore till newline
        while (sc.hasNextLine()) {
            String wordToIgnore = sc.nextLine();
            if (!wordToIgnore.isEmpty())
                wordsToIgnore.add(wordToIgnore);
            else
                break;
        }
        //read titles till newline
        while (sc.hasNextLine()) {
            String title = sc.nextLine();
            if (!title.isEmpty())
                titles.add(title);
            else
                break;
        }
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public ArrayList<String> getWordsToIgnore() {
        return wordsToIgnore;
    }
}
