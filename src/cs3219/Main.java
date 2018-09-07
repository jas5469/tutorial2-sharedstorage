package cs3219;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SharedDataStorage sharedDataStorage = new SharedDataStorage();
        Input input = new Input(sharedDataStorage);
        input.readInput();
        new CircularShifter(sharedDataStorage);
        new Alphabetizer(sharedDataStorage);
        new Output(sharedDataStorage);

    }
}
