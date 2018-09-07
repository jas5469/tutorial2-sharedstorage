package cs3219;

import java.util.ArrayList;
import java.util.Collections;

public class Alphabetizer {

    public Alphabetizer(SharedDataStorage sharedDataStorage) {
        ArrayList<String> listOfStringsToSort = sharedDataStorage.getListOfStringsAfterCircularShift();

        Collections.sort(listOfStringsToSort);
        sharedDataStorage.writeTolistOfStringsAfterAlphabetize(listOfStringsToSort);

    }
}
