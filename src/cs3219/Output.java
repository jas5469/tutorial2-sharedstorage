package cs3219;

import java.util.ArrayList;

public class Output {

    public Output(SharedDataStorage sharedDataStorage) {
        ArrayList<String> toPrint = sharedDataStorage.getlistOfStringsAfterAlphabetize();
        for(int i = 0 ; i < toPrint.size(); i++) {
            System.out.println(toPrint.get(i));
        }
    }
}
