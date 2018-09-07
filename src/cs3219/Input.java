package cs3219;

import java.util.*;
import java.io.*;

public class Input {
    private SharedDataStorage sharedDataStorageToBeUsedInInput;

    public Input(SharedDataStorage sharedDataStorage) {
        sharedDataStorageToBeUsedInInput = sharedDataStorage;
    }

    public void readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the words to ignore.");
        System.out.println("To move on to line input , press enter one more time.");
        //read words to ignore till newline
        while (sc.hasNextLine()) {
            String wordToIgnore = sc.nextLine();
            if (!wordToIgnore.isEmpty())
                sharedDataStorageToBeUsedInInput.writeToWordsToIgnoreList(wordToIgnore);
            else
                break;
        }
        //read titles till newline
        System.out.println("Please enter your input line.");
        System.out.println("If you want to end your input, press enter one more time.");
        while (sc.hasNextLine()) {
            String title = sc.nextLine();
            if (!title.isEmpty())
                sharedDataStorageToBeUsedInInput.writeToTitlesList(title);
            else
                break;
        }
    }

}
