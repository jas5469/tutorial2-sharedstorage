package cs3219;
import java.util.*;

public class CircularShifter {
    private ArrayList<String> output;

    public CircularShifter(SharedDataStorage sharedDataStorage){
        output = new ArrayList<String>();
        ArrayList<String> wordsToIgnore = sharedDataStorage.getInputWordsToIgnoreList();
        ArrayList<String> titles = sharedDataStorage.getInputTitleList();

        for(String title : titles){
            String[] wordsInTitle = title.split(" ");
            Queue<String> queueTitle = new LinkedList<String>();
            for(String word : wordsInTitle){
                queueTitle.offer(word);
            }
            for(int i = 0; i< wordsInTitle.length; i++){
                String wordToCheck = queueTitle.peek();
                boolean shouldIgnore = false;
                for(String word : wordsToIgnore){
                    if(wordToCheck.equalsIgnoreCase(word)){
                        shouldIgnore = true;
                        break;
                    }
                }
                if(!shouldIgnore){
                    output.add(queueToString(queueTitle));
                }
                shift(queueTitle);
            }
        }

        sharedDataStorage.writeToListOfStringsAfterCircularShift(output);
    }


    //helper methods
    private String queueToString(Queue<String> title){
        Queue<String> tempTitle = new LinkedList<String>(title);
        String newTitle = "";
        while(tempTitle.peek() != null){
            if(newTitle == ""){
                newTitle = newTitle.concat(tempTitle.poll());}
            else
                newTitle = newTitle.concat(" " + tempTitle.poll());
        }
        return newTitle;
    }

    private void shift(Queue<String> title){
        String firstWord = title.poll();
        title.offer(firstWord);
    }
}
