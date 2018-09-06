package cs3219;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        InputFilter input = new InputFilter();
        input.readInput();
        new CircularShifterFilter(input.getWordsToIgnore(),input.getTitles());
    }
}
